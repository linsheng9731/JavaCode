package utils;

/**
 * Created by damon_lin on 15/6/2.
 */

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class excelTools {
//TradeNO.","BatchNo","BankBillNo","Alipaydueamount","Merchantdueamount"
    public static Map<String,String> titlemap = new HashMap<String, String>() ;
    static{
        titlemap.put("eventdate","eventDate");
        titlemap.put("type","eventType");
        titlemap.put("BankIndexValue","bankIndexValue");
        titlemap.put("Channel","channel");
        titlemap.put("BankIndexValueType","bankIndexValueType");
        titlemap.put("REFNO.","refNo");
        titlemap.put("ReasonCode","reasonCode");
        titlemap.put("eventamount","eventAmount");
        titlemap.put("eventcurrency","eventCurrency");
        titlemap.put("settlecurrency","settleCurrency");

        titlemap.put("replydate","replyDate");
        titlemap.put("Representment","representment");
        titlemap.put("PartialRepresentment","partialRepresentment");
        titlemap.put("Alipaypaidamount","alipayPaidAmount");
        titlemap.put("Merchantpaidamount","merchantPaidAmount");
        titlemap.put("settleamount","settleAmount");

        titlemap.put("TradeNO.","tradeNO");
        titlemap.put("BatchNo","batchNo");
        titlemap.put("BankBillNo","bankBillNo");
        titlemap.put("Alipaydueamount","alipayDueAmount");
        titlemap.put("Merchantdueamount","merchantDueAmount");


    }


    public static void main(String[] args) throws Exception {

        File file = new File("/Users/damon_lin/Documents/GitHub/JavaCode/RuleChecker/src/main/java/utils/ExcelDemo.xls");

        String[][] result = getData(file, 0);

        String[] title = result[0];

        int rowLength = result.length;

        String checkNotNull = "[";
        int checkNotNullCnt = 0;

        String checkMustNull = "[";
        int checkMustNullCnt = 0;

        String others = "[";
        int othersCnt = 0;

        for (int i = 1; i < rowLength; i++) {

            for (int j = 0; j < result[i].length; j++) {

                if (result[i][j].equals("notnull")){
                    checkNotNull+="\"";
                    checkNotNull+=titlemap.get(title[j])==null?title[j]:titlemap.get(title[j]);
                    checkNotNull+="\",";
                    checkNotNullCnt++;
                }else
                if (result[i][j].equals("mustnull")){
                    checkMustNull+="\"";
                    checkMustNull+=titlemap.get(title[j])==null?title[j]:titlemap.get(title[j]);
                    checkMustNull+="\",";
                    checkMustNullCnt++;
                }else {
                    others+="\"";
                    others+=titlemap.get(title[j])==null?title[j]:titlemap.get(title[j]);
                    others+=(":"+result[i][j]);
                    others+="\",";
                    othersCnt++;
                }
            }
            System.out.println(checkMustNullCnt+checkNotNullCnt+ othersCnt);
            System.out.println(checkNotNullCnt+"{"+" "+"\"checkNotNull\":" +checkNotNull+"]}");
            System.out.println();
            checkNotNull="[";
            checkNotNullCnt=0;

            System.out.println(checkMustNullCnt+"{"+" "+"\"checkMustNull\":" +checkMustNull+"]}");
            System.out.println();
            checkMustNull="[";
            checkMustNullCnt=0;

            System.out.println(othersCnt+"{"+" "+"\"others\":" +others+"]}");
            System.out.println();
            others="[";
            othersCnt=0;

            System.out.println("==============================================");

        }


    }

    /**
     * 读取Excel的内容，第一维数组存储的是一行中格列的值，二维数组存储的是多少个行
     *
     * @param file       读取数据的源Excel
     * @param ignoreRows 读取数据忽略的行数，比喻行头不需要读入 忽略的行数为1
     * @return 读出的Excel中数据的内容
     * @throws FileNotFoundException
     * @throws IOException
     */

    public static String[][] getData(File file, int ignoreRows)

            throws FileNotFoundException, IOException {

        List<String[]> result = new ArrayList<String[]>();

        int rowSize = 0;

        BufferedInputStream in = new BufferedInputStream(new FileInputStream(

                file));

        // 打开HSSFWorkbook

        POIFSFileSystem fs = new POIFSFileSystem(in);

        HSSFWorkbook wb = new HSSFWorkbook(fs);

        HSSFCell cell = null;

        for (int sheetIndex = 0; sheetIndex < wb.getNumberOfSheets(); sheetIndex++) {

            HSSFSheet st = wb.getSheetAt(sheetIndex);

            for (int rowIndex = ignoreRows; rowIndex <= st.getLastRowNum(); rowIndex++) {

                HSSFRow row = st.getRow(rowIndex);

                if (row == null) {
                    continue;
                }
                int tempRowSize = row.getLastCellNum() + 1;
                if (tempRowSize > rowSize) {
                    rowSize = tempRowSize;
                }
                String[] values = new String[rowSize];

                Arrays.fill(values, "");

                boolean hasValue = false;

                for (short columnIndex = 0; columnIndex <= row.getLastCellNum(); columnIndex++) {

                    String value = "";

                    cell = row.getCell(columnIndex);

                    if (cell != null) {

                        // 注意：一定要设成这个，否则可能会出现乱码

//                        cell.setEncoding(HSSFCell.ENCODING_UTF_16);

                        switch (cell.getCellType()) {

                            case HSSFCell.CELL_TYPE_STRING:

                                value = cell.getStringCellValue();
                                break;

                            case HSSFCell.CELL_TYPE_NUMERIC:

                                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                                    Date date = cell.getDateCellValue();
                                    if (date != null) {
                                        value = new SimpleDateFormat("yyyy-MM-dd")
                                                .format(date);
                                    } else {
                                        value = "";
                                    }
                                } else {
                                    value = new DecimalFormat("0").format(cell
                                            .getNumericCellValue());
                                }
                                break;
                            case HSSFCell.CELL_TYPE_FORMULA:
                                // 导入时如果为公式生成的数据则无值
                                if (!cell.getStringCellValue().equals("")) {
                                    value = cell.getStringCellValue();
                                } else {
                                    value = cell.getNumericCellValue() + "";
                                }

                                break;

                            case HSSFCell.CELL_TYPE_BLANK://  有一行为空直接跳出

                                continue;

                            case HSSFCell.CELL_TYPE_ERROR:

                                value = "";

                                break;

                            case HSSFCell.CELL_TYPE_BOOLEAN:

                                value = (cell.getBooleanCellValue() == true ? "Y"

                                        : "N");
                                break;
                            default:
                                value = "";
                        }
                    }
                    if (columnIndex == 0 && value.trim().equals("")) {
                        break;
                    }
                    values[columnIndex] = rightTrim(value);

                    hasValue = true;

                }
                if (hasValue) {
                    result.add(values);
                }
            }
        }
        in.close();
        String[][] returnArray = new String[result.size()][rowSize];
        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i] = (String[]) result.get(i);
        }
        return returnArray;
    }


    /**
     * 去掉字符串右边的空格
     *
     * @param str 要处理的字符串
     * @return 处理后的字符串
     */

    public static String rightTrim(String str) {

        if (str == null) {

            return "";

        }

        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {

            if (str.charAt(i) != 0x20) {

                break;

            }

            length--;

        }

        return str.substring(0, length);

    }

}