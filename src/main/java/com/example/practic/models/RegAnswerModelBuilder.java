package com.example.practic.models;

public class RegAnswerModelBuilder {
    private Boolean family;
    private Boolean name;
    private Boolean email;
    private Boolean phone;
    private Boolean password;
    private Boolean userIsNotExist;
    private Boolean regComplete;

    public boolean AllFielldFilled(){
        return family & name & email & phone & password;
    }

        public RegAnswerModelBuilder withName(String n){
            this.name = n != null;
            return this;
        }
        public RegAnswerModelBuilder withFamily(String f){
            this.family = f != null;
            return this;
        }
        public RegAnswerModelBuilder withPhone(String ph){
            this.phone = ph != null;
            return this;
        }
        public RegAnswerModelBuilder withPassword(String pw){
            this.password = pw != null;
            return this;
        }
        public RegAnswerModelBuilder withEmail(String e){
            this.email = e != null;
            return this;
        }
        public RegAnswerModelBuilder build() {
            RegAnswerModelBuilder regAnswerModelBuilder = new RegAnswerModelBuilder();
            regAnswerModelBuilder.name = name;
            regAnswerModelBuilder.family = family;
            regAnswerModelBuilder.phone = phone;
            regAnswerModelBuilder.password = password;
            regAnswerModelBuilder.email = email;
            if (AllFielldFilled())
                return regAnswerModelBuilder;
            else
                return  null;
        }
    public Boolean getUserIsNotExist() {
        return userIsNotExist;
    }

    public Boolean getRegComplete() {
        return regComplete;
    }

    public void setRegComplete() {
        if (userIsNotExist == null)
            this.regComplete = false;
        else
            this.regComplete = AllFielldFilled()&userIsNotExist;
    }

    public void setUserIsNotExist(Boolean userIsNotExist) {
        this.userIsNotExist = userIsNotExist;
    }

}
