package com.alipay.yihang.sofamvc;

/**
 * Created by damon_lin on 15/5/26.
 */
public interface Strategy {
    public ErrorWrapper rulesCheck(OfflineRiskDatumDO DO);
}
