## 簡介
爬山演算法 HC (Hill-Climbing Algorithm) 是單粒子型算法中最簡單的一種，實作相當容易，且執行速度很快。因此，經常被用來作為各種最佳化演算法的比較基準。但是，由於爬山演算法只尋找鄰近的點進行比較，而且不允許向較差的方向行走，這使得爬山演算法很容易落入山谷區而無法跳出。因而喪失找到更好解的機會

## 爬山演算法
    Algorithm Hill-Climbing(pi)
      p = pi // 設定粒子 p 為起始粒子 pi
      while not isEnd()
        pn = move(p) //選擇粒子p的鄰居pn
        if pn.energy()<=p.energy() //能量更低，就接受
          p = pn;
    End Algorithm
    
模擬退火 SA (Simulated annealing) 演算法改進了爬山演算法的部分缺點，採用以溫度調控的機率特性，讓爬山演算法有機會跳脫較差的區域，因而找到更好的解。但是，當較好的區域距離目前所在地區較遠時，模擬退火演算法通常難以逆向爬升脫離較大的山谷。

## 梯度下降法
梯度下降法（英語：Gradient descent）是一個一階最佳化算法，通常也稱為最陡下降法，但是不該與近似積分的最陡下降法（英語：Method of steepest descent）混淆。 要使用梯度下降法找到一個函數的局部極小值，必須向函數上當前點對應梯度（或者是近似梯度）的反方向的規定步長距離點進行疊代搜索。如果相反地向梯度正方向疊代進行搜索，則會接近函數的局部極大值點；這個過程則被稱為梯度上升法。

## hillClimbing1
程式碼沒修改(執行OK，可以理解)  
[return -1*(x*x-2*x+1)](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/02-%E7%88%AC%E5%B1%B1%E6%BC%94%E7%AE%97%E6%B3%95/Result1.md)\
[return -1*(x*x+3*x+5)](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/02-%E7%88%AC%E5%B1%B1%E6%BC%94%E7%AE%97%E6%B3%95/Result2.md)\
[return -1*abs(x*x-4)](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/02-%E7%88%AC%E5%B1%B1%E6%BC%94%E7%AE%97%E6%B3%95/Result3.md)

## hillClimbing2
程式碼沒修改(執行OK，可以理解)  
[Result](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/02-%E7%88%AC%E5%B1%B1%E6%BC%94%E7%AE%97%E6%B3%95/hillClimbing2.md)

## hillClimbingNumber
程式碼沒修改(執行OK，可以理解)  
[Result](https://github.com/a922777/ai108b/blob/master/%E5%AD%B8%E7%BF%92%E7%AD%86%E8%A8%98/02-%E7%88%AC%E5%B1%B1%E6%BC%94%E7%AE%97%E6%B3%95/hillClimbingNumber.md)


## 程式碼參考來源

[老師的課堂範例](https://github.com/ccccourse/ai/tree/master/python/02-optimize)

## 文章參考來源

[爬山演算法](http://ccckmit.wikidot.com/so:hillclimbing)\
[梯度下降法](https://zh.wikipedia.org/wiki/%E6%A2%AF%E5%BA%A6%E4%B8%8B%E9%99%8D%E6%B3%95)
