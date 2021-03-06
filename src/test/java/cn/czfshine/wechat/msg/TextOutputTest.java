package cn.czfshine.wechat.msg;

import cn.czfshine.wechat.contant.Contact;
import cn.czfshine.wechat.output.TextOutput;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @author:czfshine
 * @date:2018/2/21 10:53
 */

public class TextOutputTest {
    static String testdbpath="data/db/decrypted171028.db";

    @Test
    public void TextMassageOutputTest() throws SQLException, IOException, ClassNotFoundException {
        MsgDataBase msgDataBase = MsgDataBase.buildFromFile("data/output/test1.obj");

        Contact contact = msgDataBase.getAllChatRoom().get(0);
        List<Message> messages = contact.getMessages();
        TextOutput.toTextFile(messages.toArray(new Message[0]),new FileOutputStream("data/output/out.txt"));
    }
}
