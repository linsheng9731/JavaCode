package jackson;

/**
 * Created by damon_lin on 15/6/3.
 */
public class JsonConfig {
    public static final String jsongConfig = "[{\"AE\":{\n" +
            "  \"strategy1\": [\n" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"settleCurrency\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]},\n" +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "  ],\n" +
            "\n" +
            "  \"strategyL\": [\n" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"settleCurrency\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]},\n" +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "  ],\n" +
            "  \"strategyR0\": [\n" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]},\n" +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategyR1\": [\n" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]},\n" +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategy2\": [\n" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"settleCurrency\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]},\n" +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategyR2\": [\n" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "\n" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]},\n" +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkNNNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategy3\": [\n" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"settleCurrency\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "\n" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]},\n" +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "  ],\n" +
            "  \"strategyR3\": [\n" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]},\n" +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategyR_HWWH\": [\n" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"settleCurrency\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "\n" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]},\n" +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "  ],\n" +
            "  \"strategyR\": [\n" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "\n" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]},\n" +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkBoth\":[\"settleCurrency\",\"settleAmount\"]},\n" +
            "\n" +
            "    {\"checkNullBothNull\":[\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkNotNullOrNotNull\":[\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "\n" +
            "\n" +
            "  ],\n" +
            "  \"strategyTZ\": [\n" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"settleCurrency\",\"alipayPaidAmount\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\",\"merchantPaidAmount\"]},\n" +
            "\n" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]},\n" +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategyZC\": [\n" +
            "    { \"checkNotNull\":[\"bankBillNo\",\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"settleCurrency\",\"merchantPaidAmount\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\"]},\n" +
            "\n" +
            "    {\"checkOr\":[\"tradeNo\",\"batchNo\"]},\n" +
            "    {\"checkOr\":[\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "\n" +
            "  ]\n" +
            "}},\n" +
            "\n" +
            "\n" +
            "{\"TW\":{\n" +
            "  \"strategy1\": [\n" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"settleCurrency\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "\n" +
            "  \"strategyL\": [\n" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"settleCurrency\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategyR0\": [\n" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "\n" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategyR1\": [\n" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "\n" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategy2\": [\n" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"settleCurrency\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategyR2\": [\n" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "\n" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkNNNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategy3\": [\n" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"settleCurrency\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategyR3\": [\n" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"representment\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "\n" +
            "    {\"checkNMustNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "    {\"checkYNotNull\":[\"representment\",\"partialRepresentment\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkYYNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "    {\"checkNNullNotNull\":[\"representment\",\"PartialRepresentment\",\"settleCurrency\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYNNull\":[\"representment\",\"PartialRepresentment\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkYYOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "    {\"checkNNullOrNotNull\":[\"representment\",\"PartialRepresentment\",\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategyR_HWWH\": [\n" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"replyDate\",\"representment\",\"partialRepresentment\",\"settleAmount\",\"settleCurrency\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\",\"merchantPaidAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategyR\": [\n" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"alipayPaidAmount\",\"merchantPaidAmount\"]},\n" +
            "\n" +
            "    {\"checkBoth\":[\"settleCurrency\",\"settleAmount\"]},\n" +
            "\n" +
            "    {\"checkNullBothNull\":[\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\"]},\n" +
            "\n" +
            "    {\"checkNotNullOrNotNull\":[\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategyTZ\": [\n" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"settleCurrency\",\"alipayPaidAmount\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\",\"merchantPaidAmount\"]}\n" +
            "\n" +
            "  ],\n" +
            "  \"strategyZC\": [\n" +
            "    { \"checkNotNull\":[\"eventDate\",\"eventType\",\"bankIndexValue\",\"platform\",\"channel\",\"bankIndexValueType\",\"refNo\",\"reasonCode\",\"eventAmount\",\"eventCurrency\",\"replyDate\",\"settleCurrency\",\"merchantPaidAmount\",\"operator\"]},\n" +
            "    { \"checkMustNull\":[\"representment\",\"partialRepresentment\",\"settleAmount\",\"alipayDueAmount\",\"merchantDueAmount\",\"alipayPaidAmount\"]}\n" +
            "\n" +
            "  ]\n" +
            "}\n" +
            "}\n" +
            "]\n" +
            "/*\n" +
            " Date gmtCreate;   Date gmtModified;  eventDate;   eventType; bankIndexValue;   platform;  channel;   bankIndexValueType;\n" +
            "\n" +
            "  refNo;   tradeNo;  batchNo;   bankBillNo; reasonCode;  eventAmount; eventAmount; eventCurrency; replyDate;representment;\n" +
            "\n" +
            "  partialRepresentment;settleAmount; settleCurrency; alipayDueAmount;\n" +
            "\n" +
            "  merchantDueAmount;  alipayPaidAmount; merchantPaidAmount;  fee; operator; deleteCheck; uniqKey;\n" +
            "\n" +
            "\"TradeNO.\",\"BatchNo\",\"BankBillNo\",\"Alipaydueamount\",\"Merchantdueamount\",\"fee\",\n" +
            "\n" +
            "*/\n" +
            "\n" +
            "";

}
