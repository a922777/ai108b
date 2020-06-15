    > python kbQuery.py animal.kb 
    ['哺乳類 <= 有毛', '\n哺乳類 <= 泌乳', '\n鳥類   <= 有羽毛', '\n鳥類   <= 會飛 & 生蛋', '\n食肉類
    <= 哺乳類 & 吃肉', '\n食肉類 <= 有爪 & 利齒 & 兩眼前視', '\n有蹄類 <= 哺乳類 & 有蹄', '\n偶蹄類 
    <= 哺乳類 & 反芻', '\n獵豹   <= 哺乳類 & 吃肉 & 斑點', '\n老虎   <= 哺乳類 & 吃肉 & 條紋', '\n長 
    頸鹿 <= 有蹄類 & 長腿 & 斑點', '\n斑馬   <= 有蹄類 & 條紋', '\n鴕鳥   <= 鳥類 & 長腿', '']       
    rule:head=哺乳類 terms=['有毛']
    rule:head=哺乳類 terms=['泌乳']
    rule:head=鳥類 terms=['有羽毛']
    rule:head=鳥類 terms=['會飛 ', ' 生蛋']
    rule:head=食肉類 terms=['哺乳類 ', ' 吃肉']
    rule:head=食肉類 terms=['有爪 ', ' 利齒 ', ' 兩眼前視']
    rule:head=有蹄類 terms=['哺乳類 ', ' 有蹄']
    rule:head=偶蹄類 terms=['哺乳類 ', ' 反芻']
    rule:head=獵豹 terms=['哺乳類 ', ' 吃肉 ', ' 斑點']
    rule:head=老虎 terms=['哺乳類 ', ' 吃肉 ', ' 條紋']
    rule:head=長頸鹿 terms=['有蹄類 ', ' 長腿 ', ' 斑點']
    rule:head=斑馬 terms=['有蹄類 ', ' 條紋']
    rule:head=鴕鳥 terms=['鳥類 ', ' 長腿']
    facts= dict_keys([])
    ?-