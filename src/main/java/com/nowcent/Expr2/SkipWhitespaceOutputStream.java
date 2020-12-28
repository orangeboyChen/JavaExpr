package com.nowcent.Expr2;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author orangeboy
 * @version 1.0
 * @date 2020/12/14 16:27
 */
public class SkipWhitespaceOutputStream extends FilterOutputStream {
    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field <tt>this.out</tt> for later use, or
     *            <code>null</code> if this instance is to be
     *            created without an underlying stream.
     */
    public SkipWhitespaceOutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        if(b != ' ' && b != '\n'){
            super.write(b);
        }
    }


}
