package com.manas.dto.convering;

public interface Convert<TO, FROM> {

    public TO convert(FROM from);

}
