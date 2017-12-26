package com.shang.spring.learn.conditional;

public class WindowsListDirServiceImp implements ListDirService {
    @Override
    public String showCmd() {
        return "dir";
    }
}
