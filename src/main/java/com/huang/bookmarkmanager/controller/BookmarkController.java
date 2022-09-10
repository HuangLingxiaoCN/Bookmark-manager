package com.huang.bookmarkmanager.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookmarkController {

    @GetMapping("/bookmarks")
    public String getBookmarks() {
        return "Get all bookmarks";
    }

    @GetMapping("/bookmark")
    public String getBookmark() {
        return "Get one bookmark";
    }

    @PostMapping("/bookmarks")
    public String createBookmark() {
        return "Create one bookmark";
    }

    @PutMapping("/bookmarks")
    public String updateBookmark() {
        return "Update one bookmark";
    }

    @DeleteMapping("/bookmarks")
    public String deleteBookmark() {
        return "Delete one bookmark";
    }
}
