/*
 * Copyright 2011 Google Inc.
 * Copyright 2015 Andreas Schildbach
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bitcoinj.core;

import com.google.common.base.Objects;
import org.bitcoinj.script.Script;
import org.bitcoinj.wallet.KeyBag;
import org.bitcoinj.wallet.RedeemData;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.OutputStream;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

/**
 * <p>This message is a reference or pointer to an output of a different transaction.</p>
 * 
 * <p>Instances of this class are not safe for use by multiple threads.</p>
 */
public class TransactionAtomicswap {
    private String secretHash;
    private Boolean initiate;

    private String contract;
    private String secret;
    private Boolean redeem;
    private Boolean atomicSwap;

    private Long lockTime;

    public TransactionAtomicswap(String secretHash, Boolean initiate, String contract, String secret, Boolean redeem, Boolean atomicSwap, Long lockTime) {
        this.secretHash = secretHash;
        this.initiate = initiate;

        this.contract = contract;
        this.secret = secret;
        this.redeem = redeem;
        this.atomicSwap = atomicSwap;
        this.lockTime = lockTime;
    }


    public String getSecretHash() {
        return secretHash;
    }

    public Boolean isInitiate() {
        return initiate;
    }

    public String getContract() {
        return contract;
    }

    public String getSecret() {
        return secret;
    }

    public Boolean isRedeem() {
        return redeem;
    }

    public Boolean isAtomicSwap() {
        return atomicSwap;
    }

    public Long getLockTime() {
        return this.lockTime;
    }

}
