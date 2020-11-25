package com.example.tutorial001.exception;

import androidx.annotation.Nullable;

public class InvalideException extends Exception {
    private String message = "معتبر نمی باشد";

    @Nullable
    @Override
    public String getMessage() {
        return message;
    }
}
