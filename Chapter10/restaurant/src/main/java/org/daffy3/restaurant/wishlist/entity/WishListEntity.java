package org.daffy3.restaurant.wishlist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.daffy3.restaurant.db.MemoryDBEntity;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class WishListEntity extends MemoryDBEntity {

    private String title; // 가게명 혹은 음식명
    private String category; // 카테고리
    private String address; // 주소
    private String roadAddress; // 도로명 주소
    private String pageUrl; // 홈페이지 링크
    private String imageUrl; // 이미지 URL
    private boolean isVisit; // 방문여부
    private int visitCount; // 방문횟수
    private LocalDateTime lastVisitDate; // 마지막 방문일자

}
