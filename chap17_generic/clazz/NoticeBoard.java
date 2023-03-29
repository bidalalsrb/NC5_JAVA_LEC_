package chap17_generic.clazz;

public class NoticeBoard {
    private int nBoardNo;
    private String nBoardTitle;
    private String nBoardContents;

    @Override
    public String toString() {
        return "NoticeBoard{" +
                "nBoardNo=" + nBoardNo +
                ", nBoardTitle='" + nBoardTitle + '\'' +
                ", nBoardContents='" + nBoardContents + '\'' +
                '}';
    }

    public int getnBoardNo() {
        return nBoardNo;
    }

    public void setnBoardNo(int nBoardNo) {
        this.nBoardNo = nBoardNo;
    }

    public String getnBoardTitle() {
        return nBoardTitle;
    }

    public void setnBoardTitle(String nBoardTitle) {
        this.nBoardTitle = nBoardTitle;
    }

    public String getnBoardContents() {
        return nBoardContents;
    }

    public void setnBoardContents(String nBoardContents) {
        this.nBoardContents = nBoardContents;
    }
}
