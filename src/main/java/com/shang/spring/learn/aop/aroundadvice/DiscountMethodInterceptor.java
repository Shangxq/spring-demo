package com.shang.spring.learn.aop.aroundadvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DiscountMethodInterceptor implements MethodInterceptor {
    private static final Integer DEFAULT_DISCOUNT_RATIO = 80;
    private Integer discountRadio = DEFAULT_DISCOUNT_RATIO;
    private boolean campaignAvailable;

    public Integer getDiscountRadio() {
        return discountRadio;
    }

    public void setDiscountRadio(final Integer discountRadio) {
        this.discountRadio = discountRadio;
    }

    public boolean isCampaignAvailable() {
        return campaignAvailable;
    }

    public void setCampaignAvailable(final boolean campaignAvailable) {
        this.campaignAvailable = campaignAvailable;
    }

    @Override
    public Integer invoke(final MethodInvocation invocation) throws Throwable {
        Object returnVal = invocation.proceed();
        if(isCampaignAvailable()){
            return ((Integer)returnVal)*getDiscountRadio()/100;
        }
        return (Integer)returnVal;
    }
}
