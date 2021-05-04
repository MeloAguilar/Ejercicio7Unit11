package Clases;

public class Locker {

    private String passWord;
    private boolean unlock;
    private int tries;

    public Locker(String passWord, int tries) {
        this.passWord = passWord;
        this.unlock = false;
        this.tries = tries;
    }

    public String getPassWord() {
        return passWord;
    }

    public String lockPassWord() {
        String lockedPassword = "";
        if (!this.unlock) {
            for (int i = 0; i < passWord.length ( ); i++) lockedPassword += "*";
        } else {
            lockedPassword = this.passWord;

        }
        return lockedPassword;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public void setUnlock(boolean unlock) {
        this.unlock = unlock;
    }
}
