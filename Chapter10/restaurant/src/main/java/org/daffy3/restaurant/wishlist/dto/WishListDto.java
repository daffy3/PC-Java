package org.daffy3.restaurant.wishlist.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WishListDto {

    private Integer index;
    private String title; // 음식명, 장소명
    private String category; // 카테고리
    private String address; // 주소
    private String roadAddress; // 도로명
    private String pageUrl; // 홈페이지 주소
    private String imageUrl; // 이미지
    private boolean isVisit; // 방문여부
    private int visitCount; // 방문횟수
    private LocalDateTime lastVisitDate; // 마지막 방문일자

}
