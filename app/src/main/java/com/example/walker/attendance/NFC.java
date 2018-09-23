package com.example.walker.attendance;


import android.nfc.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NFC extends AppCompatActivity {

    NfcAdapter nfcAdapter;
    NfcManager nfcManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        nfcAdapter = nfcManager.getDefaultAdapter();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfc);
        NdefRecord usr = new NdefRecord(username);
        NdefRecord usrmail = new NdefRecord(email);
        NdefMessage message = new NdefMessage(usr, usrmail);
        nfcAdapter.setNdefPushMessage(message, this);
    }
}
