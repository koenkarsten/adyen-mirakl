/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Mirakl Connector
 *
 * Copyright (c) 2018 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 *
 */

package com.adyen.mirakl.config;

public abstract class MiraklProperties {

    private String miraklEnvUrl;
    private String miraklApiKey;
    private String miraklOperatorEmail;

    public String getMiraklEnvUrl() {
        return miraklEnvUrl;
    }

    public void setMiraklEnvUrl(final String miraklEnvUrl) {
        this.miraklEnvUrl = miraklEnvUrl;
    }

    public String getMiraklApiKey() {
        return miraklApiKey;
    }

    public void setMiraklApiKey(final String miraklApiKey) {
        this.miraklApiKey = miraklApiKey;
    }

    public String getMiraklOperatorEmail() {
        return miraklOperatorEmail;
    }

    public void setMiraklOperatorEmail(String miraklOperatorEmail) {
        this.miraklOperatorEmail = miraklOperatorEmail;
    }
}
