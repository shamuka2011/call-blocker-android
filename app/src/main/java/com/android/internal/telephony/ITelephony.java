package com.android.internal.telephony;

/**
 * Created by BARSA on 8/21/2018.
 */

public interface ITelephony {

    boolean endCall();

    void answerRingingCall();

    void silenceRinger();
}
