# utc

* create at : 2024-02-16
* update at : 2024-02-19
* spec : jdk-17
* feat : calculate utc to dateTime with timezone

@2024-02-19 : add v1.0.0 calculate UTC


# add practical git command in terminal
저장소 연결, 메인 브랜치 생성, readme 파일생성, 변경목록에 추가, 커밋
계정확인, 계정변경, 푸시
* git remote add origin https://github.com/Ashajisu/utc.git
* git remote -v
  * origin  https://github.com/Ashajisu/utc.git (fetch)
  * origin  https://github.com/Ashajisu/utc.git (push)
* git branch -M main
* echo "# utc" >> README.md
* git add README.md
* git commit -m "first commit in terminal"
* git config user.name
* git config user.email
* git config --global user.name "Ashajisu"
* git config --global user.email "asha.jisu@gmail.com"
* git push -u origin main


# 자격증명
제어판 _ 사용자계정 _ 자격 증명 관리자 _ window 자격 증명 _ 일반 자격증명에 git 계정이 등록되어 있어야 함 <br>
`GitHub - https://api.github.com/계정이름`

없으면 다음 오류가 발생
```
remote: Permission to SOMJANG-42MARU/gitTestRepo.git denied to SOMJANG.fatal: unable to access 'https://github.com/SOMJANG-42MARU/gitTestRepo.git/': The requested URL returned error: 403
```


