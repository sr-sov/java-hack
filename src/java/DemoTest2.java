package java;

import java.io.*;
import java.util.ArrayList;

class Sentence {
	public static String wordA;
	private Integer wordCount;
	private int wordOccurence=0;
	private String sentence;
	private String[] wordArr;
	
	public Sentence(String s) {
		this.sentence = s;
		this.wordArr = s.split(" ");
		for(String word: wordArr) {
			if(word.equals(wordA)) {
				this.wordOccurence++;
			}	
		}
	}
		
	public Integer getWordCount() {
		this.wordCount = wordOccurence;
		return this.wordCount;
	}
	
	public String getSentence() {
		return this.sentence;
	}
	
	public static void setWordA(String word) {
		wordA=word;
	}
	
}

public class DemoTest2
{  
	public static void sort(ArrayList<Sentence> list) {
		 
        list.sort((o1, o2)
                  -> o1.getWordCount().compareTo(
                      o2.getWordCount()));
    }
	public static int countWords(String str, String wordA) {
		int wordCount=0;
		if(str == null || str.isEmpty()) {
			return 0;
		}
		String[] words = str.split(" ");
		for(String word: words) {
			if(word.equals(wordA)) {
				wordCount++;
			}
		}
		return wordCount;
	}
    public static void main (String[] args) throws java.lang.Exception
    {
    //use the following code to fetch input from console
     String line;
     int lineCount = 0;
     int size = 0;

     ArrayList<String> wordList = new ArrayList<String>();
     ArrayList<Sentence> sentenceList = new ArrayList<Sentence>();
     
     BufferedReader  br  =  new  BufferedReader(new  InputStreamReader(System.in));
     
     while((line=br.readLine())!=null && !line.equals("exit"))    
     {
         if(lineCount==0) {
        	 size = Integer.parseInt(line);
         }
         else if(lineCount==1) {
        	 Sentence.setWordA(line);
        	 //Sentence.wordA = line;
         }
         else if(lineCount>=2) {
        	 wordList.add(line);
         }
         lineCount++;
     }
     //create object of sentences
     for(String s: wordList) {
    	 Sentence sentence = new Sentence(s);
    	 sentenceList.add(sentence);
     }
     

     for(Sentence sentence: sentenceList) {
    	 System.out.println(sentence.getSentence());
     }

	 sort(sentenceList);
	 
	 for(Sentence sentence: sentenceList) {
    	 System.out.println(sentence.getSentence());
     }

     
    }  
}