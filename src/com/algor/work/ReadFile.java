package com.algor.work;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.util.Print;

public class ReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = "D:\\1work\\logAnalysis\\search.log.2012-06-13";

        File file = new File(fileName);

        BufferedReader reader = null;

        List<String> logList =  new ArrayList<String>();
        
        try {
            System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");
            reader = new BufferedReader(new FileReader(file));
            Long line = 0l;
            Integer lineFlag = 0;
            // һ�ζ���һ�У�ÿ��ȡlineCount��ִ��һ�β������ݽ����ݿ�Ĳ���
            while (reader.readLine() != null) {
                line++;
                lineFlag++;
                if(lineFlag >= 10000){
                	Print.println("have read the line:"+line);
                	lineFlag=0;
                }
            }
            
            Print.println("The rows of file is "+line);
            
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }

    }

}
