## 邏輯推論
## 布林邏輯與公理系統
想要理解甚麼是數學，最快速的捷徑是從公理系統下手，因為公理系統是數學證明的核心，理解了公理系統之後，就可以看懂數學家到底在玩甚麼遊戲了！

但是、很多數學的公理系統太過複雜，因此很難解釋，讀者往往在還沒入門之前，就已經先恍神了，所以為了讓大家很容易的理解公理系統，我們選擇了一個最簡單的數學體系，那就是布林邏輯。

布林邏輯只有兩個值，那就是 0 與 1 ，所以可以說是最簡單的數學體系了，就讓我們從布林邏輯開始，理解何謂公理系統吧！

## 計算理論
但對公理化數學體系最精彩的一段歷史是，希爾伯特對公理化的問題與歌德爾不完備定理對數學可完全公理化的反證，以下是這段歷史的簡要說明。

20 世紀的大數學家 Hilbert 曾經於 1900 年提出的 23 個數學問題中提到一個問題，就是「是否能為數學系統建立證明法則，讓數學證明可以完全被計算出來」，後來歌德爾 (Godel) 在 1926 年證明了一階邏輯的完備定理，讓大家看到了一線曙光，但歌德爾在 1929 年又提出了一個數論系統的不完備定理，證明了有些定理無法透過計算程序證明。

歌德爾的研究，後來在電腦領域，被圖靈 (Turing) 重新詮釋了一遍，圖靈證明了「停止問題」是電腦無法 100% 正確判定的問題，這也開啟了後來計算理論的研究之河。圖靈也因此而成為計算理論領域的第一人，所以 ACM 這個組織才會將電腦界的最重要獎項稱為「圖靈獎」(Turing Award)。
## 理髮師悖論
理髮師悖論（Barber paradox）是羅素用來比喻羅素悖論的一個通俗說法，是由伯特蘭·羅素在1901年提出的。羅素悖論的出現是由於樸素集合論對於集合的不加限制的定義。由於當時集合論已成為數學理論的基礎，這一悖論的出現直接導致了一場數學危機，也引發了眾多的數學家對這一問題的補救，最終形成了現在的公理化集合論。同時，羅素悖論的出現促使數學家認識到將數學基礎公理化的必要性。
## λ演算
* [λ演算.wiki](https://zh.wikipedia.org/wiki/%CE%9B%E6%BC%94%E7%AE%97)
* [不動點組合子.wiki](https://zh.wikipedia.org/wiki/%E4%B8%8D%E5%8A%A8%E7%82%B9%E7%BB%84%E5%90%88%E5%AD%90)
* [基本數論的一個不可解決的問題](https://www.ics.uci.edu/~lopes/teaching/inf212W12/readings/church.pdf)
阿隆佐·丘奇（Alonzo Church），《美國數學雜誌》，第1卷。》，第58卷第2期（1936年4月），第345-363頁
* 教堂（1940）。[簡單的類型理論的提法。符號邏輯學報](http://www.classes.cs.uchicago.edu/archive/2007/spring/32001-1/papers/church-1940.pdf)5（2）：56-68。

塞爾丁（2006）。
* [咖哩與教會的邏輯](https://en.wikipedia.org/wiki/History_of_the_Church%E2%80%93Turing_thesis)。在《邏輯歷史手冊》，第5卷：從羅素到教堂的邏輯，第5頁。819—874。北荷蘭省：阿姆斯特丹。
## kbTest
程式碼沒修改(執行OK，可以理解)\
[kbTest](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/06-%E9%82%8F%E8%BC%AF%E6%8E%A8%E8%AB%96/kbTest.py)\
[Result](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/06-%E9%82%8F%E8%BC%AF%E6%8E%A8%E8%AB%96/kbTest.md)
## kbReason
程式碼沒修改(執行OK，可以理解)\
[kbReason](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/06-%E9%82%8F%E8%BC%AF%E6%8E%A8%E8%AB%96/kbReason.py)\
[Result](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/06-%E9%82%8F%E8%BC%AF%E6%8E%A8%E8%AB%96/kbReason.md)
## kbQuery
程式碼沒修改(執行OK，可以理解)\
[kbQuery](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/06-%E9%82%8F%E8%BC%AF%E6%8E%A8%E8%AB%96/kbQuery.py)\
[Result](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/06-%E9%82%8F%E8%BC%AF%E6%8E%A8%E8%AB%96/kbQuery.md)

## 文章參考來源
* [邏輯推論](https://misavo.com/blog/%E9%99%B3%E9%8D%BE%E8%AA%A0/%E6%9B%B8%E7%B1%8D/%E4%BA%BA%E5%B7%A5%E6%99%BA%E6%85%A7/06-%E9%82%8F%E8%BC%AF%E6%8E%A8%E8%AB%96?fbclid=IwAR0ZrDeSPvfjJ-ydhZ0oMyCNKYEIfXF6hi0uOKu0mQg7JmvujqycH09KjfM)
* [布林邏輯與公理系統](https://misavo.com/blog/%E9%99%B3%E9%8D%BE%E8%AA%A0/%E6%9B%B8%E7%B1%8D/%E4%BA%BA%E5%B7%A5%E6%99%BA%E6%85%A7/06-%E9%82%8F%E8%BC%AF%E6%8E%A8%E8%AB%96/A-%E9%82%8F%E8%BC%AF%E6%8E%A8%E8%AB%96%E7%B0%A1%E4%BB%8B?fbclid=IwAR0v_lP7udtgEU-NGyoJ0gPMiyxJ2D6LRL-cfNwR65AnEmTXfodaJhJTI5w)
* [計算理論](https://misavo.com/blog/%E9%99%B3%E9%8D%BE%E8%AA%A0/%E6%9B%B8%E7%B1%8D/%E4%BA%BA%E5%B7%A5%E6%99%BA%E6%85%A7/06-%E9%82%8F%E8%BC%AF%E6%8E%A8%E8%AB%96/A2-%E8%A8%88%E7%AE%97%E7%90%86%E8%AB%96?fbclid=IwAR3TNuGtI6SR0g8pnU-goWRkXDMcV3AYfQp-s-ZCJyBFmrZ_Ki6llFQuQsU)
* [理髮師悖論.wiki](https://zh.wikipedia.org/wiki/%E7%90%86%E5%8F%91%E5%B8%88%E6%82%96%E8%AE%BA?fbclid=IwAR1dsKPZwFStxCWGQyCrXkME-NSIJ65zzPMVYQsCI0e07S6079YLHkZXCZ8)
* [λ演算](https://misavo.com/blog/%E9%99%B3%E9%8D%BE%E8%AA%A0/%E6%9B%B8%E7%B1%8D/%E4%BA%BA%E5%B7%A5%E6%99%BA%E6%85%A7/06-%E9%82%8F%E8%BC%AF%E6%8E%A8%E8%AB%96/A3-%CE%BB%E6%BC%94%E7%AE%97?fbclid=IwAR2nQ3LXUVR8oz3jAmgQaUiKwHihOq-R7Jc0uS5gpLxDhVatTLNUab6tNxw)
## 程式碼參考來源

* [06-logic](https://github.com/ccccourse/ai/tree/master/python/06-logic)
