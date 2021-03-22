package com.knoldus;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookCrawlerTest {
  PhoneBookCrawler crawler = new PhoneBookCrawler();

  String name ="rajeev upadhyaya";
  String number ="7351002810";
    @Test
    void findPhoneNoByNameAndPunishIfNothingFound() {
String num = crawler.findPhoneNoByNameAndPunishIfNothingFound(name);
assert (num.equals("7351002811"));
    }

    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFound() {
        String num = crawler.findPhoneByNameAndPrintPhoneBookIfNothingFound(name);
        assert (num.equals("7351002811"));
    }

    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod() {
        String num = crawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod(name);

        Assert.assertEquals(num,"7351002811");
    }

    @Test
    void findPhoneNumberByNameUsingStream() {
        String num= crawler.findPhoneNumberByNameUsingStream(name);
    Assert.assertEquals(num,"7351002811");
    }


    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams() {
        String num = crawler.findPhoneNumberByNameUsingStream(name);
        Assert.assertEquals(num,"7351002811");
    }
    @Test
    void findPhoneNumberByNameOrNameByPhoneNumber(){
        String num = crawler.findPhoneNumberByNameOrNameByPhoneNumber(name,number);
        Assert.assertEquals(num,"7351002811");
    }
    @Test
    void findPhoneNumberByNameOrNameByPhoneNumber2(){
        name ="tosh";
        String nameBy = crawler.findPhoneNumberByNameOrNameByPhoneNumber(name,number);
        Assert.assertEquals(nameBy,"navneet upadhyaya");
    }
}
