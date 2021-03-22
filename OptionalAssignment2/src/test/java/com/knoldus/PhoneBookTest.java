package com.knoldus;

import java.util.Optional;

class PhoneBookTest {
 PhoneBook phoneBookObject = new PhoneBook();


    @org.junit.jupiter.api.Test
    void findPhoneByName() {
String name ="rajeev upadhyaya";
        Optional<String> phoneNum = phoneBookObject.findPhoneByName(name);
assert(phoneNum.get().equals("7351002811"));
    }

    @org.junit.jupiter.api.Test
    void findNameByPhoneNumber() {
String number ="7351002810";
Optional<String> name = phoneBookObject.findNameByPhoneNumber(number);
assert (name.get().equals("navneet upadhyaya"));
    }



}
