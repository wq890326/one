package com.example.demo.config;


import org.springframework.security.crypto.password.PasswordEncoder;
//  下次关键字记得好好使用，才行。
public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return null;
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return false;
    }
}
