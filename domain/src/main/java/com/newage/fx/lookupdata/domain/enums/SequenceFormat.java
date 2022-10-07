package com.newage.fx.lookupdata.domain.enums;

public enum SequenceFormat {
    ONE("%01d"), TWO("%02d"), THREE("%03d"), FOUR("%04d"), FIVE("%05d"), SIX("%06d"), SEVEN("%07d"), EIGHT("%08d"), NINE("%09d"), TEN("%10d");

    String format;

    SequenceFormat(String f) {
        format = f;
    }

    public String getFormat() {
        return format;
    }
}
