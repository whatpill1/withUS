package com.example.withus.mapper;

import com.example.withus.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {   // Mapper 메서드 이름은 DB 관점에서!
    List<UserVo> getUserList(); // User 테이블 가져오기
    void insertUser(UserVo userVo); // 회원가입
    UserVo getUserByEmail(UserVo userVo);    // 회원 정보 가져오기
    UserVo getUserById(Integer mbr_sn);
    void updateUser(UserVo userVo); // 회원 정보 수정
    void deleteUser(Integer mbr_sn); // 회원 탈퇴
}