## 神經網路
在電腦領域，神經網路是指一種模擬神經系統所設計出來的程式，用來模擬人類視覺、聽覺等等智慧行為的原理，企圖讓電腦可以具有人類智慧的一種方法。

## 範數
範數（英語：norm），是具有「長度」概念的函數。在線性代數、泛函分析及相關的數學領域，是一個函數，其為向量空間內的所有向量賦予非零的正長度或大小。另一方面，半範數（英語：seminorm）可以為非零的向量賦予零長度。

舉一個簡單的例子，一個二維度的歐氏幾何空間{\displaystyle \mathbb {R} ^{2}}\mathbb {R} ^{2}就有歐氏範數。在這個向量空間的元素（譬如：(3,7)）常常在笛卡兒座標系統被畫成一個從原點出發的箭號。每一個向量的歐氏範數就是箭號的長度。

擁有範數的向量空間就是賦範向量空間。同樣，擁有半範數的向量空間就是賦半範向量空間。
## diff
程式碼沒修改(執行OK，可以理解)  
[diff.py](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/03-%E7%A5%9E%E7%B6%93%E7%B6%B2%E8%B7%AF/diff.py)\
[Result](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/03-%E7%A5%9E%E7%B6%93%E7%B6%B2%E8%B7%AF/Result.md)
```py
def diff(f, x):
    df = f(x+dx)-f(x)
    return df/dx
```

## vecGradient
程式碼沒修改(執行OK，可以理解)  
[vecGradient.py](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/03-%E7%A5%9E%E7%B6%93%E7%B6%B2%E8%B7%AF/vecGradient.py)\
[Result](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/03-%E7%A5%9E%E7%B6%93%E7%B6%B2%E8%B7%AF/Result2.md)

## net1
程式碼沒修改(執行OK，可以理解)  
[net1.py](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/03-%E7%A5%9E%E7%B6%93%E7%B6%B2%E8%B7%AF/net1.py)\
[Result](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/03-%E7%A5%9E%E7%B6%93%E7%B6%B2%E8%B7%AF/net1.md)

## net2
程式碼沒修改(執行OK，可以理解)  
[net2.py](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/03-%E7%A5%9E%E7%B6%93%E7%B6%B2%E8%B7%AF/net2.py)\
[Result](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/03-%E7%A5%9E%E7%B6%93%E7%B6%B2%E8%B7%AF/net2.md)

## net3
程式碼沒修改(執行OK，可以理解)  
[net3.py](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/03-%E7%A5%9E%E7%B6%93%E7%B6%B2%E8%B7%AF/net3.py)\
[Result](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/03-%E7%A5%9E%E7%B6%93%E7%B6%B2%E8%B7%AF/net3.md)

## 文章參考來源
* [CNN、RNN、DNN](https://www.zhihu.com/question/34681168)
* [神經網路簡介](https://misavo.com/blog/%E9%99%B3%E9%8D%BE%E8%AA%A0/%E6%9B%B8%E7%B1%8D/%E4%BA%BA%E5%B7%A5%E6%99%BA%E6%85%A7/03-%E7%A5%9E%E7%B6%93%E7%B6%B2%E8%B7%AF/A-%E4%BD%95%E8%AC%82%E7%A5%9E%E7%B6%93%E7%B6%B2%E8%B7%AF%EF%BC%9F?fbclid=IwAR2hHrV6YtNAhdnkJPyuL0kZ_vQoYU8lrOO1ozd5_WU6IxnRuwCECs7c-V0)
* [範數](https://zh.wikipedia.org/wiki/%E8%8C%83%E6%95%B0?fbclid=IwAR07RAAlaj2txKRkYuwT27TMO-IkZdPs52v61C-1461wqi3cwIijHMdgzs4)

## 程式碼參考來源
[03-neuralnet](https://github.com/ccccourse/ai/tree/master/python/03-neuralnet)

