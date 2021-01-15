package com.wf.captcha;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 测试类
 * Created by 王帆 on 2018-07-27 上午 10:08.
 */
public class CaptchaTest {

    private static File outputDir = new File(String.format("%s/%d/",TestUtil.getOutputDirectory(),System.currentTimeMillis()));

    @BeforeClass
    public static void init(){
        System.out.println("Init output directory:" + outputDir.toString());
        outputDir.mkdirs();
    }

    @Test
    public void test() throws Exception {
        for (int i = 0; i < 10; i++) {
            SpecCaptcha specCaptcha = new SpecCaptcha();
            specCaptcha.setLen(4);
            specCaptcha.setFont(i, 32f);
            System.out.println(specCaptcha.text());
            specCaptcha.out(new FileOutputStream(new File(outputDir,"SpecCaptcha_"+i + ".png")));
        }
    }

    @Test
    public void testGIf() throws Exception {
        for (int i = 0; i < 10; i++) {
            GifCaptcha gifCaptcha = new GifCaptcha();
            gifCaptcha.setLen(5);
            gifCaptcha.setFont(i, 32f);
            System.out.println(gifCaptcha.text());
            gifCaptcha.out(new FileOutputStream(new File(outputDir,"GifCaptcha_"+i + ".gif")));
        }
    }

    @Test
    public void testHan() throws Exception {
        for (int i = 0; i < 10; i++) {
            ChineseCaptcha chineseCaptcha = new ChineseCaptcha();
            System.out.println(chineseCaptcha.text());
            chineseCaptcha.out(new FileOutputStream(new File(outputDir,"ChineseCaptcha_"+i + ".png")));
        }
    }

    @Test
    public void testGifHan() throws Exception {
        for (int i = 0; i < 10; i++) {
            ChineseGifCaptcha chineseGifCaptcha = new ChineseGifCaptcha();
            System.out.println(chineseGifCaptcha.text());
            chineseGifCaptcha.out(new FileOutputStream(new File(outputDir,"ChineseGifCaptcha_"+i + ".gif")));
        }
    }

    @Test
    public void testArit() throws Exception {
        for (int i = 0; i < 10; i++) {
            ArithmeticCaptcha specCaptcha = new ArithmeticCaptcha();
            specCaptcha.setLen(3);
            specCaptcha.setFont(i, 28f);
            System.out.println(specCaptcha.getArithmeticString() + " " + specCaptcha.text());
            specCaptcha.out(new FileOutputStream(new File(outputDir,"ArithmeticCaptcha_"+i + ".png")));
        }
    }

    @Test
    public void testBase64() throws Exception {
        GifCaptcha specCaptcha = new GifCaptcha();
        System.out.println(specCaptcha.toBase64(""));
    }

}
