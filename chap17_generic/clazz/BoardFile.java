package chap17_generic.clazz;

import java.util.List;

public class BoardFile<T> {
    // T = FreeBoard는 boardNo == fBoardNo
    // T = NoticBoard는 boardNo == nBoardNo
    
    private int boardNo;
    // 1 : 자유게시판 / 2: 공지사항
    private int type;
    private String boardFileNm;

    private T t;
    private List<T> tList;

    public int getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }

    public int gettype() {
        return type;
    }

    public void settype(int type) {
        this.type = type;
    }

    public String getBoardFileNm() {
        return boardFileNm;
    }

    public void setBoardFileNm(String boardFileNm) {
        this.boardFileNm = boardFileNm;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "BoardFile{" +
                "boardNo=" + boardNo +
                ", type=" + type +
                ", boardFileNm='" + boardFileNm + '\'' +
                ", t=" + t +
                '}';
    }
}