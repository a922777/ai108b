## 以深度優先搜尋解決老鼠走迷宮問題
雖然深度優先搜尋 (DFS) 與廣度優先搜尋 (BFS) 等演算法通常是用在「圖形」這種結構上的，不過「圖形」的結構倒是不一定要真實且完整的表達出來，在很多人工智慧的問題上，我們不會看到完整的「圖形結構」，只會看到某個節點有哪些鄰居節點，然後就可以用 BFS 與 DFS 進行搜尋了。

老鼠走迷宮問題，就是一個可以採用圖形搜尋來解決的經典問題，其中每個節點的鄰居，就是上下左右四個方向，只要沒有被牆給擋住，就可以走到鄰居節點去，因此我們可以採用圖形搜尋的方法來解決迷宮問題，以下是我們的程式實作。
## 老鼠走迷宮問題

[修改的程式](https://github.com/a922777/ai108b/blob/master/HW3/Mouse.java)\
[執行結果](https://github.com/a922777/ai108b/blob/master/HW3/Result.md)

## graph_search
程式碼沒修改(執行OK，部分可以理解)
[Result](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/04-%E5%9C%96%E5%BD%A2%E6%90%9C%E5%B0%8B/graph_search.md)
## puzzleSearch
程式碼沒修改(執行OK，部分可以理解)
[Result](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/04-%E5%9C%96%E5%BD%A2%E6%90%9C%E5%B0%8B/puzzleSearch.md)
## 文章參考來源

[深度與廣度搜尋法](https://misavo.com/blog/%E9%99%B3%E9%8D%BE%E8%AA%A0/%E6%9B%B8%E7%B1%8D/%E4%BA%BA%E5%B7%A5%E6%99%BA%E6%85%A7/04-%E5%9C%96%E5%BD%A2%E6%90%9C%E5%B0%8B/B-%E5%AF%A6%E4%BD%9C%EF%BC%9A%E6%B7%B1%E5%BA%A6%E8%88%87%E5%BB%A3%E5%BA%A6%E6%90%9C%E5%B0%8B%E6%B3%95?fbclid=IwAR00G5McBeR8V2iSBBRtUV91jz-__NnfMvd0WnPPKD2CYvMF4o5sPV6s8oU)\
[老鼠走迷宮](https://atain4u.wordpress.com/2010/03/23/%E8%B3%87%E6%96%99%E7%B5%90%E6%A7%8B-%E8%80%81%E9%BC%A0%E8%B5%B0%E8%BF%B7%E5%AE%AE/?fbclid=IwAR3TxuEmkqNHzjyyJkcr2gYfO7wYNS5dGkTVhKDSwV1vzsMmCtolndBzrwg)\
[七巧板拼圖](https://apkpure.com/cn/block-puzzle-tangram/com.hiza.pj015)
## 程式碼參考來源

[老鼠走迷宮問題](https://misavo.com/blog/%E9%99%B3%E9%8D%BE%E8%AA%A0/%E6%9B%B8%E7%B1%8D/%E4%BA%BA%E5%B7%A5%E6%99%BA%E6%85%A7/04-%E5%9C%96%E5%BD%A2%E6%90%9C%E5%B0%8B/C-%E5%AF%A6%E4%BD%9C%EF%BC%9A%E8%80%81%E9%BC%A0%E8%B5%B0%E8%BF%B7%E5%AE%AE%E5%95%8F%E9%A1%8C)
