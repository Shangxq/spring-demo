package com.shang.spring.learn.conditional;

public class LinuxListDirServiceImp implements ListDirService {
    @Override
    public String showCmd() {
        return "ls";
    }
}
