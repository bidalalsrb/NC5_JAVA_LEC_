package chap17_generic.clazz;

public class FreeBoard {
    private int fBoardNo;
    private String fBoardTitle;
    private String fBoardContents;

    public int getfBoardNo() {
        return fBoardNo;
    }

    public void setfBoardNo(int fBoardNo) {
        this.fBoardNo = fBoardNo;
    }

    public String getfBoardTitle() {
        return fBoardTitle;
    }

    @Override
    public String toString() {
        return "FreeBoard{" +
                "fBoardNo=" + fBoardNo +
                ", fBoardTitle='" + fBoardTitle + '\'' +
                ", fBoard='" + fBoardContents + '\'' +
                '}';
    }

    public void setfBoardTitle(String fBoardTitle) {
        this.fBoardTitle = fBoardTitle;
    }

    public String getfBoardContents() {
        return fBoardContents;
    }

    public void setfBoardContents(String fBoardContents) {
        this.fBoardContents = fBoardContents;
    }
}
