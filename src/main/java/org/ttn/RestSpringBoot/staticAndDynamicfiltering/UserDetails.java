package org.ttn.RestSpringBoot.staticAndDynamicfiltering;

import com.fasterxml.jackson.annotation.JsonFilter;
import net.minidev.json.annotate.JsonIgnore;

public class UserDetails {



    @JsonFilter("SomeBeanFilter")


        @JsonIgnore
        private String  name;
        private Integer age;
        private String password;

        public UserDetails(String name, int age, String password) {
            this.name = name;
            this.age = age;
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "UserDetails{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

