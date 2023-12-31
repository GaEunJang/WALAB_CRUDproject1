# 의류 관리 시스템

## 프로젝트 소개
사용자는 콘솔 인터페이스를 통해 의류 항목을 추가, 조회, 수정, 삭제, 검색 및 정렬할 수 있습니다.

## 구현 기능
- **CRUD 작업**: 의류 데이터의 생성, 읽기, 업데이트, 삭제 기능.
- **검색 기능**: 타입별 의류 검색 기능.
- **정렬 기능**: 데이터 정렬 기능.

## 사용된 라이브러리
- **java.util.ArrayList**
- **java.util.Comparator**
- **java.util.Scanner**

## 클래스 및 패키지
- **org.example.ClothingData**
  - 의류 데이터를 표현하는 클래스입니다.
  - 각 의류 항목은 고유 ID, 타입, 이름, 가격, 설명 속성을 가집니다.
- **org.example.DataManager**
  - 의류 데이터의 CRUD 작업을 관리합니다.
  - 사용자의 입력을 처리하고 데이터 리스트를 관리합니다.
- **org.example.Main**
  - 애플리케이션의 진입점입니다.
  - 사용자에게 메뉴를 제공하고, 사용자의 선택에 따라 DataManager 클래스의 메소드를 호출합니다.

## 사용 방법
1. 프로그램을 실행합니다.
2. 콘솔에서 제공되는 메뉴를 사용하여 원하는 작업을 선택합니다.
   - `추가`: 새로운 의류 데이터를 추가합니다.
   - `조회`: 저장된 의류 데이터를 조회합니다.
   - `수정`: 기존 의류 데이터를 수정합니다.
   - `삭제`: 의류 데이터를 삭제합니다.
   - `검색`: 특정 타입의 의류를 검색합니다.
   - `정렬`: 이름 또는 가격 기준으로 데이터를 정렬합니다.
3. 프로그램을 종료하려면 '0'을 선택합니다.

## 스크린샷
<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject1/assets/103119924/03876b77-dda8-4e9d-bf86-453af9cef5d2.png"><br>

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject1/assets/103119924/f006f376-da33-4d07-8308-a3894bbfe59f.png"><br>

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject1/assets/103119924/f46b6547-82b0-43cf-979c-f4e3c4ac0f14.png"><br>

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject1/assets/103119924/8d5ce59b-9ccd-4dc1-baf1-cee36a3424b3.png"><br>

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject1/assets/103119924/d7a8c34b-7a25-4aa6-a55c-099ec7cd6535.png"><br>

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject1/assets/103119924/8dbff461-5c05-4b6c-973e-65cc1b1cf13d.png"><br>

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject1/assets/103119924/5bd6daf1-26aa-4d8b-8466-c3c1c8484676.png"><br>

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject1/assets/103119924/d5e7c13c-da80-428c-b600-74f4e7298a85.png"><br>

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject1/assets/103119924/32ca114f-cd6e-43b7-8170-5316401c26e1.png"><br>

<img width="250" src="https://github.com/GaEunJang/WALAB_CRUDproject1/assets/103119924/5e63eef1-bb85-4dd5-bbc4-1f9c33bee28b.png"><br>
