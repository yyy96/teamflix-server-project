# netflix-test-server-bon-zeze
+ 넷플릭스_b 서버 팀 프로젝트을 위한 저장소




# 2022.03.19 개발 일지


### 제제 & 본(Bon)

<details>
<summary>기능 API 목록 작성 </summary>
<div markdown="1">
  

기능 API 목록
- [ ] 계정(Account)
    - 생성 (1)
        - [x] 회원가입
        - [ ] 이메일 인증
        - [ ] 결제수단 등록
    - 변경 (4)
        - [ ] 이메일
        - [ ] 비밀번호
        - [ ] 휴대폰번호
        - [ ] 멤버쉽 (결제API구현 이후 생각)
    - [ ] 탈퇴
    - [ ] 조회
    - 로그인
        - [ ] 일반 로그인
        - 소셜 로그인
            - [ ] 네이버
            - [ ] 카카오톡
            - [ ] 구글
            - [ ] 페이스북
    - [ ] 로그아웃
    - 비밀번호 찾기 (2)
        - [ ] 문자 보내기
        - [ ] SMS 인증


- 프로필(Profile)
    - [ ] 생성(1계정당 5개 가능)
    - 변경
        - [ ] 언어
        - [ ] 이름
        - [ ] 자동재생설정
        - [ ] 사진선택
    - [ ] 삭제
    - [ ] 목록 조회
    - [ ] 조회 

---

- 영화
    - 목록 조회
        - [ ] TOP 10 순위 영상들
        - [ ] 찜한 콘텐츠 보여주기
        - [ ] 인기 콘텐츠 보여주기
        - [ ] 최신 등록 콘텐츠
        - [ ] 시청중인 콘텐츠
        - [ ] 장르별 콘텐츠
    - [ ] 상세 정보 조회
    - [ ] 조회

- 시리즈
    - 목록 조회
        - [ ] TOP 10 순위 영상들
        - [ ] 찜한 콘텐츠 보여주기
        - [ ] 인기 콘텐츠 보여주기
        - [ ] 최신 등록 콘텐츠
        - [ ] 시청중인 콘텐츠
        - [ ] 장르별 콘텐츠
    - [ ] 상세 정보 조회
    - [ ] 조회


</div>
</details>

<details>
<summary>2. ERD 1차 초안 설계</summary>
<div markdown="1">

![vvzvzv](https://user-images.githubusercontent.com/34790699/159122534-d40937c3-096f-4635-a5ac-2782a6accb06.png)

</div>
</details>

### 본(Bon)


 + EC2, RDS 서버 구축
 + 서브 도메인(dev, prod) 적용
 + prod 폴더에 스프링 템플릿 적용
 + 서브도메인(dev, prod)에 각각 SSL 적용(By CertBot)


# 2022.03.20 개발 일지

### 본(Bon)
+ 계정(Account)서비스를 위한 골격 구현
+ 넷플릭스 계정 회원가입 API 구현
