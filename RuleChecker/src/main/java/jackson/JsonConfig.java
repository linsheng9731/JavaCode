package jackson;

/**
 * Created by damon_lin on 15/6/3.
 */
public class JsonConfig {
    public static final String jsongConfig = "[{\"AE\":{" +
            "  \"strategy1\": [" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"settleCurrency\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]}," +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "  ]," +
            "" +
            "  \"strategyL\": [" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"settleCurrency\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]}," +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "  ]," +
            "  \"strategyR0\": [" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]}," +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]}," +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategyR1\": [" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]}," +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]}," +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategy2\": [" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"settleCurrency\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]}," +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategyR2\": [" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]}," +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]}," +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkNNNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategy3\": [" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"settleCurrency\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]}," +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "  ]," +
            "  \"strategyR3\": [" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]}," +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]}," +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategyR_HWWH\": [" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"settleCurrency\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]}," +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "  ]," +
            "  \"strategyR\": [" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]}," +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkBoth\":[\"settleCurrency\",\"settleAmount\"]}," +
            "" +
            "    {\"checkNullBothNull\":[\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkNotNullOrNotNull\":[\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "" +
            "" +
            "  ]," +
            "  \"strategyTZ\": [" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"settleCurrency\",\"alipayPaidAmount\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\",\"merchantPaidAmount\"]}," +
            "" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]}," +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategyZC\": [" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"settleCurrency\",\"merchantPaidAmount\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\"]}," +
            "" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]}," +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "" +
            "  ]" +
            "}}," +
            "" +
            "" +
            "{\"TW\":{" +
            "  \"strategy1\": [" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"settleCurrency\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}" +
            "" +
            "  ]," +
            "" +
            "  \"strategyL\": [" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"settleCurrency\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategyR0\": [" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]}," +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategyR1\": [" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]}," +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategy2\": [" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"settleCurrency\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategyR2\": [" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]}," +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkNNNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategy3\": [" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"settleCurrency\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategyR3\": [" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]}," +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]}," +
            "" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategyR_HWWH\": [" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"settleCurrency\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategyR\": [" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}," +
            "" +
            "    {\"checkBoth\":[\"settleCurrency\",\"settleAmount\"]}," +
            "" +
            "    {\"checkNullBothNull\":[\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\"]}," +
            "" +
            "    {\"checkNotNullOrNotNull\":[\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategyTZ\": [" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"settleCurrency\",\"alipayPaidAmount\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\",\"merchantPaidAmount\"]}" +
            "" +
            "  ]," +
            "  \"strategyZC\": [" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"settleCurrency\",\"merchantPaidAmount\",\"operator\"]}," +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\"]}" +
            "" +
            "  ]" +
            "}" +
            "}" +
            "]" ;

}
