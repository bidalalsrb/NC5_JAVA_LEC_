package chap17_generic;

import chap17_generic.clazz.BoardFile;
import chap17_generic.clazz.FreeBoard;
import chap17_generic.clazz.NoticeBoard;

public class _01_useOfGeneric {
    public static void main(String[] args) {
        // 자유게시판 게시글에 대한 첨부파일

        BoardFile<FreeBoard> fBoardFile = new BoardFile<FreeBoard>();
        //아래 방식으로도 선언할 수 있고
        fBoardFile.setT(new FreeBoard());
        fBoardFile.getT().setfBoardNo(1);
        fBoardFile.getT().setfBoardTitle("qew");
        fBoardFile.getT().setfBoardContents("we");
        fBoardFile.setBoardNo(fBoardFile.getT().getfBoardNo());

        fBoardFile.settype(fBoardFile.getT().getClass().getSimpleName().equals("FreeBoard") ? 1 : 2);

        BoardFile<NoticeBoard> nBoardFile = new BoardFile<NoticeBoard>();
        nBoardFile.setT(new NoticeBoard());
        nBoardFile.getT().setnBoardNo(2);
        nBoardFile.getT().setnBoardTitle("두번째");
        nBoardFile.getT().setnBoardContents("두번쨰~~~~");
        nBoardFile.setBoardNo(nBoardFile.getT().getnBoardNo());

        nBoardFile.settype(nBoardFile.getT().getClass().getSimpleName().equals("NoticeBoard") ? 1 : 2);
        System.out.println(nBoardFile);


//        FreeBoard fboard = new FreeBoard();
//        fboard.setfBoardNo(1);
//        fboard.setfBoardTitle("test");
//        fboard.setfBoardContents("test입니다");
//        fBoardFile.setT(fboard);

        // 공지사항 게시글에 대한 첨부파일



    }
}
