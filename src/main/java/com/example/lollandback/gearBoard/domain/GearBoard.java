package com.example.lollandback.gearBoard.domain;

import com.example.lollandback.gameBoard.domain.GameBoardFile;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class  GearBoard {
    private Integer gear_id;
    private String  gear_title ;
    private String  gear_content;
    private String category;
    private LocalDateTime gear_inserted ;
    private Integer gear_views;
    private Integer gear_recommand;
    // gear_uploadFiles 는  카운트 파일임
    private String gear_uploadFiles;
   private Integer commnetcount;
   private Integer countFile;


    private String member_id;

    private List<GearFile> files;



}

