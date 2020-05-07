package com.sunkai.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * @ClassName IOTest
 * @Description 将代码拼接的sql保存到本地文件中
 * @Author sunkai
 * @Date 2020/5/7 9:24
 * @Version 1.0
 **/
public class IOTest {
    public static void main(String[] args) {
        try {
            File file = new File("D://syncCompanyName.sql"); // 相对路径，如果没有则要建立一个新的output.txt文件
            file.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            FileWriter writer = new FileWriter(file);
            BufferedWriter out = new BufferedWriter(writer);

            for (int i = 0 ; i <100 ; i++) {
                out.write("UPDATE member SET company_name = '"+i+"',pushman_company_id = "+i+"  WHERE member_id = "+i+" and (company_name IS NULL OR company_name = '');"); // \r\n即为换行
                out.write("\r\n"); // \r\n即为换行
                out.flush(); // 把缓存区内容压入文件
            }

            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
