@startuml

partition "全体フロー"
(*) --> "mainメソッド"

--> "メインスレッド初期化"

--> "メインスレッド起動"

--> (*)
end partition
@enduml