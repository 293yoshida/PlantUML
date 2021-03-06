@startuml

partition "メインスレッド処理フロー"
partition "コンストラクター"
(*) --> "画面フレーム設定"
--> "UI設定"
end partition

if "スレッド停止フラグ" as while then
partition "run"
	--> [true]  "計算処理"
	--> "更新処理"
	--> "描画"
	--> while
end partition
else
	--> [false] "終了処理"
end if


--> (*)
end partition



@enduml