		隨機森林說明(Random Forest)
		集成(Ensemble)是將多個模型的結果組合在一起，透過投票或是加權的
		方式得到最終結果。
		
		決策樹生成時，是考慮所有資料與特徵來做切分的
		而隨機森林的每一顆樹在生成過程中，都是隨機使用一部份的訓練資料與特徵
		代表每棵樹都是隨機的資料訓練而成的。

        模型參數
        n_estimators= 決策樹的數量
        Criterion: 衡量資料相似程度的 
        max_features= 如何選取 features
        max_depth: 樹能生長的最深限制
        Min_samples_split: 至少要多少樣本以上才進行切分
        Min_samples_lear: 最終的葉子 (節點) 上至少要有多少樣本

        訊息增益 (Information Gain)
        決策樹模型會用 features 切分資料，該選用哪個 feature 來來切分則是由訊息
        增益的大小決定的。希望切分後的資料相似程度很高，通常使用吉尼係數來
        衡量相似程度。

        函數計算準確率(accuracy_score)
        不管是正確預測的fraction（default），還是count(normalize=False)。
        在multilabel分類中，該函數會返回子集的準確率。如果對於一個樣本來說，必須嚴格匹配真實資料集中的label，整個集合的預測標籤返回1.0；否則返回0.0.
        預測值與真實值的準確率，在n個樣本下的計算公式如下：
        accuracy(y,ŷ )=1nsamples∑i=0nsamples−1l(ŷ i=yi)accuracy(y,y^)=1nsamples∑i=0nsamples−1l(y^i=yi)


        決策樹的特徵重要性 (Feature importance)
        我們可以從構建樹的過程中，透過 feature 被⽤用來切分的次數，來得知哪些features 是相對有用的
        所有 feature importance 的總和為 1
        實務上可以使用 feature importance 來了解模型如何進行分類圖片




