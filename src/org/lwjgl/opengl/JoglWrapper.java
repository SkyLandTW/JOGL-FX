/**
 * Public Domain, use as you wish
 *
 * Created by AqD on 2014/08/17.
 */
package org.lwjgl.opengl;

import org.lwjgl.BufferUtils;

import javax.media.opengl.GL4bc;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawableFactory;
import javax.media.opengl.GLProfile;
import java.nio.IntBuffer;

/**
 * Provide LWJGL-only functions to JOGL calls
 *
 * @author AqD
 */
public final class JoglWrapper {

    public static GLProfile glProfile;
    public static GLDrawableFactory factory;
    public static GLContext context;
    public static GL4bc gl;

    public static int glGenBuffers() {
        IntBuffer intBuffer = BufferUtils.createIntBuffer(32);
        gl.glGenBuffers(1, intBuffer);
        return intBuffer.get(0);
    }

    public static int glGenFramebuffers()
    {
        IntBuffer intBuffer = BufferUtils.createIntBuffer(32);
        gl.glGenFramebuffers(1, intBuffer);
        return intBuffer.get(0);
    }

    public static int glGenRenderbuffers()
    {
        IntBuffer intBuffer = BufferUtils.createIntBuffer(32);
        gl.glGenRenderbuffers(1, intBuffer);
        return intBuffer.get(0);
    }

    public static int glGenTextures() {
        IntBuffer intBuffer = BufferUtils.createIntBuffer(32);
        gl.glGenTextures(1, intBuffer);
        return intBuffer.get(0);
    }

    public static void glDeleteBuffers(int buffer) {
        IntBuffer intBuffer = BufferUtils.createIntBuffer(32);
        intBuffer.put(0, buffer);
        gl.glDeleteTextures(1, intBuffer);
    }

    public static void glDeleteFramebuffers(int buffer) {
        IntBuffer intBuffer = BufferUtils.createIntBuffer(32);
        intBuffer.put(0, buffer);
        gl.glDeleteFramebuffers(1, intBuffer);
    }

    public static void glDeleteRenderbuffers(int buffer) {
        IntBuffer intBuffer = BufferUtils.createIntBuffer(32);
        intBuffer.put(0, buffer);
        gl.glDeleteRenderbuffers(1, intBuffer);
    }

    public static void glDeleteTextures(int texture) {
        IntBuffer intBuffer = BufferUtils.createIntBuffer(32);
        intBuffer.put(0, texture);
        gl.glDeleteTextures(1, intBuffer);
    }
}
