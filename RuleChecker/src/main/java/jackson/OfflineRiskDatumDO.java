/*
 * Alipay.com Inc.
 * Copyright (c) 2004 - 2010 All Rights Reserved.
 * Powered By [rapid-generator]
 */

package jackson;


import java.util.Date;


/**
 * OfflineRiskDatumDO
 * database table: offline_risk_data
 * database table comments: OfflineRiskDatum
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 *
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to
 * directory <tt>(project-home)/dalgen</tt>
 * @author badqiu(zhongxuan)
 *

 */
public class OfflineRiskDatumDO {
    private static final long serialVersionUID = -5216457518046898601L;

    /**
     * ���� 		db_column: id
     */
    private long id;
    /**
     * ����ʱ�� 		db_column: gmt_create
     */
    private Date gmtCreate;
    /**
     * �޸�ʱ�� 		db_column: gmt_modified
     */
    private Date gmtModified;
    /**
     * �¼����� 		db_column: event_date
     */
    private String eventDate;
    /**
     * �¼����� 		db_column: event_type
     */
    private String eventType;
    /**
     * �ܸ���������� 		db_column: bank_index_value
     */
    private String bankIndexValue;
    /**
     * ƽ̨ 		db_column: platform
     */
    private String platform;
    /**
     * ���� 		db_column: channel
     */
    private String channel;
    /**
     * �ܸ�������������� 		db_column: bank_index_value_type
     */
    private String bankIndexValueType;
    /**
     * �ο��� 		db_column: ref_no
     */
    private String refNo;
    /**
     * �����ţ����׺ţ� 		db_column: trade_no
     */
    private String tradeNo;
    /**
     * �ϲ�֧��Э��� 		db_column: batch_no
     */
    private String batchNo;
    /**
     * ֧������ֵ������ˮ�� 		db_column: bank_bill_no
     */
    private String bankBillNo;
    /**
     * �ܸ������� 		db_column: reason_code
     */
    private String reasonCode;
    /**
     * ��Ӧ�¼��漰�Ľ�� 		db_column: event_amount
     */
    private String eventAmount;
    /**
     * ��Ӧ�¼��漰�ı��� 		db_column: event_currency
     */
    private String eventCurrency;
    /**
     * �����գ��ظ������� 		db_column: reply_date
     */
    private String replyDate;
    /**
     * �Ƿ������ 		db_column: representment
     */
    private String representment;
    /**
     * �Ƿ񲿷������ 		db_column: partial_representment
     */
    private String partialRepresentment;
    /**
     * ���ܾܸ�/Ԥ�ٲý��ٲð��߽�� 		db_column: settle_amount
     */
    private String settleAmount;
    /**
     * ���ܽ�settleamount����Ӧ���� 		db_column: settle_currency
     */
    private String settleCurrency;
    /**
     * ����֧������е��Ľ�� 		db_column: alipay_due_amount
     */
    private String alipayDueAmount;
    /**
     * �����̻���е��Ľ�� 		db_column: merchant_due_amount
     */
    private String merchantDueAmount;
    /**
     * ֧����ʵ�ʳе���� 		db_column: alipay_paid_amount
     */
    private String alipayPaidAmount;
    /**
     * �̻�ʵ�ʳе���� 		db_column: merchant_paid_amount
     */
    private String merchantPaidAmount;
    /**
     * �Ա��̻���������� 		db_column: fee
     */
    private String fee;
    /**
     * �����Ա 		db_column: operator
     */
    private String operator;
    /**
     * �Ƿ���Ҫɾ�� 		db_column: delete_check
     */
    private String deleteCheck;
    /**
     * ��һЩ�ֶ�����������Ȼ����md5����Ϊ��¼��Ψһ��ʶ 		db_column: uniq_key
     */
    private String uniqKey;


    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventDate() {
        return this.eventDate;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventType() {
        return this.eventType;
    }

    public void setBankIndexValue(String bankIndexValue) {
        this.bankIndexValue = bankIndexValue;
    }

    public String getBankIndexValue() {
        return this.bankIndexValue;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setBankIndexValueType(String bankIndexValueType) {
        this.bankIndexValueType = bankIndexValueType;
    }

    public String getBankIndexValueType() {
        return this.bankIndexValueType;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getRefNo() {
        return this.refNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getTradeNo() {
        return this.tradeNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getBatchNo() {
        return this.batchNo;
    }

    public void setBankBillNo(String bankBillNo) {
        this.bankBillNo = bankBillNo;
    }

    public String getBankBillNo() {
        return this.bankBillNo;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonCode() {
        return this.reasonCode;
    }

    public void setEventAmount(String eventAmount) {
        this.eventAmount = eventAmount;
    }

    public String getEventAmount() {
        return this.eventAmount;
    }

    public void setEventCurrency(String eventCurrency) {
        this.eventCurrency = eventCurrency;
    }

    public String getEventCurrency() {
        return this.eventCurrency;
    }

    public void setReplyDate(String replyDate) {
        this.replyDate = replyDate;
    }

    public String getReplyDate() {
        return this.replyDate;
    }

    public void setRepresentment(String representment) {
        this.representment = representment;
    }

    public String getRepresentment() {
        return this.representment;
    }

    public void setPartialRepresentment(String partialRepresentment) {
        this.partialRepresentment = partialRepresentment;
    }

    public String getPartialRepresentment() {
        return this.partialRepresentment;
    }

    public void setSettleAmount(String settleAmount) {
        this.settleAmount = settleAmount;
    }

    public String getSettleAmount() {
        return this.settleAmount;
    }

    public void setSettleCurrency(String settleCurrency) {
        this.settleCurrency = settleCurrency;
    }

    public String getSettleCurrency() {
        return this.settleCurrency;
    }

    public void setAlipayDueAmount(String alipayDueAmount) {
        this.alipayDueAmount = alipayDueAmount;
    }

    public String getAlipayDueAmount() {
        return this.alipayDueAmount;
    }

    public void setMerchantDueAmount(String merchantDueAmount) {
        this.merchantDueAmount = merchantDueAmount;
    }

    public String getMerchantDueAmount() {
        return this.merchantDueAmount;
    }

    public void setAlipayPaidAmount(String alipayPaidAmount) {
        this.alipayPaidAmount = alipayPaidAmount;
    }

    public String getAlipayPaidAmount() {
        return this.alipayPaidAmount;
    }

    public void setMerchantPaidAmount(String merchantPaidAmount) {
        this.merchantPaidAmount = merchantPaidAmount;
    }

    public String getMerchantPaidAmount() {
        return this.merchantPaidAmount;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getFee() {
        return this.fee;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setDeleteCheck(String deleteCheck) {
        this.deleteCheck = deleteCheck;
    }

    public String getDeleteCheck() {
        return this.deleteCheck;
    }

    public void setUniqKey(String uniqKey) {
        this.uniqKey = uniqKey;
    }

    public String getUniqKey() {
        return this.uniqKey;
    }

//    public String toString() {
//        return new ToStringBuilder(this)
//                .append("Id",getId())
//                .append("GmtCreate",getGmtCreate())
//                .append("GmtModified",getGmtModified())
//                .append("EventDate",getEventDate())
//                .append("EventType",getEventType())
//                .append("BankIndexValue",getBankIndexValue())
//                .append("Platform",getPlatform())
//                .append("Channel",getChannel())
//                .append("BankIndexValueType",getBankIndexValueType())
//                .append("RefNo",getRefNo())
//                .append("TradeNo",getTradeNo())
//                .append("BatchNo",getBatchNo())
//                .append("BankBillNo",getBankBillNo())
//                .append("ReasonCode",getReasonCode())
//                .append("EventAmount",getEventAmount())
//                .append("EventCurrency",getEventCurrency())
//                .append("ReplyDate",getReplyDate())
//                .append("Representment",getRepresentment())
//                .append("PartialRepresentment",getPartialRepresentment())
//                .append("SettleAmount",getSettleAmount())
//                .append("SettleCurrency",getSettleCurrency())
//                .append("AlipayDueAmount",getAlipayDueAmount())
//                .append("MerchantDueAmount",getMerchantDueAmount())
//                .append("AlipayPaidAmount",getAlipayPaidAmount())
//                .append("MerchantPaidAmount",getMerchantPaidAmount())
//                .append("Fee",getFee())
//                .append("Operator",getOperator())
//                .append("DeleteCheck",getDeleteCheck())
//                .append("UniqKey",getUniqKey())
//                .toString();
//    }

}
