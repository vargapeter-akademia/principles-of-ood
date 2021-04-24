package hu.ak.javamiddle.ood.dip;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

public class DipDemo {


    interface AuthenticationObject {
        boolean checkPassword(byte[] passwordHash);
    }

    @Getter
    @Setter
    static class Person implements AuthenticationObject {
        private Long id;
        private String name;
        private byte[] passwordHash;

        //...

        @Override
        public boolean checkPassword(byte[] passwordHash) {
            return Arrays.equals(this.passwordHash, passwordHash);
        }

        public void changeUserName(String name) {
            setName(name);
        }

    }

}
