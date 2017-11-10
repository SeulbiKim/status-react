(ns status-im.translations.en)

(def translations
  {
   ;;common
   :members-title                         "회원"
   :not-implemented                       "!시행되지않음"
   :chat-name                             "채팅이름"
   :notifications-title                   "알림과소리"
   :offline                               "오프라인(비접속)"
   :search-for                            "검색하기"
   :cancel                                "최소"
   :next                                  "다음"
   :open                                  "열기"
   :description                           "설명"
   :url                                   "URL"
   :type-a-message                        "메세지 입력..."
   :type-a-command                        "명령어 입력..."
   :error                                 "오류"
   :unknown-status-go-error               "알수없는 상태의 오류"
   :node-unavailable                      "운영되지않는 ethereum 노드"
   :yes                                   "예"
   :no                                    "아니오"

   :camera-access-error                   "카메라 접근을 허가받기위해 시스템 설정으로 가서 카메라가 선택 되어져 있는지 상태를 확인하시오."
   :photos-access-error                   "사진 접근을 허가받기위해 시스템 설정으로 가서 사진이 선택되어져 있는지 상태를 확인하시오."

   ;;drawer
   :switch-users                          "사용자 전환"
   :current-network                       "현재 네트워크"

   ;;chat
   :is-typing                             "이(가) 입력중입니다."
   :and-you                               "당신은 어떠합니까"
   :search-chat                           "채팅을검색하시오"
   :members                               {:한명   "회원 1명"
                                           :또다른 "{{몇}} 회원"
                                           :0명  "회원 없음"}
   :members-active                        {:한명   "회원 1명"
                                           :또다른 "{{몇}} 회원"
                                           :0명  "회원 없음"}
   :public-group-status                   "공용"
   :active-online                         "접속"
   :active-unknown                        "알수없는"
   :available                             "가능"
   :no-messages                           "메세지 없음"
   :suggestions-requests                  "요청"
   :suggestions-commands                  "명령"
   :faucet-success                        "Faucet요청이수락 되었음"
   :faucet-error                          "Faucet 요청 오류"

   ;;sync
   :sync-in-progress                      "동기화중..."
   :sync-synced                           "동기화 되었음"

   ;;messages
   :status-sending                        "전송중..."
   :status-pending                        "보류중"
   :status-sent                           "전송됨"
   :status-seen-by-everyone               "모두에게 보여짐"
   :status-seen                           "보여짐"
   :status-delivered                      "전송됨"
   :status-failed                         "실패됨"

   ;;datetime
   :datetime-ago-format                   "{{숫자}} {{시간 간격}} {{전}}"
   :datetime-second                       {:일   "초"
                                           :몇 "초"}
   :datetime-minute                       {:일   "분"
                                           :몇 "초"}
   :datetime-hour                         {:한   "시간"
                                           :몇 "시간"}
   :datetime-day                          {:"하루"
                                           :몇 "일"}
   :datetime-ago                          "전"
   :datetime-yesterday                    "어제"
   :datetime-today                        "오늘"

   ;;profile
   :profile                               "프로필"
   :edit-profile                          "프로필 수정"
   :message                               "메세지"
   :not-specified                         "지정되지 않음"
   :public-key                            "공개 키"
   :phone-number                          "휴대폰 번호"
   :update-status                         "상태 업데이트..."
   :add-a-status                          "상태 추가..."
   :status-prompt                         "다른이들이 당신의 상태를 알아보고 대화 할 수 있게 헤시태그를 사용하여 당신의 상태를 설정하세요."
   :add-to-contacts                       "연락처 추가"
   :in-contacts                           "이미 연락처에 있음"
   :remove-from-contacts                  "연락처에서 삭제"
   :start-conversation                    "대화 시작"
   :send-transaction                      "거래 전송"
   :testnet-text                          "당신은 지금 {{testnet}} 테스트넷에 있습니다.. 당신의 이메일로 실제 ETH 나 SNT를 전송하지 마세요"
   :mainnet-text                          "당신은 지금 메인넷에 있습니다. 실제 ETH가 전송되어질 것입니다"

   ;;make_photo
   :image-source-title                    "프로필 이미지"
   :image-source-make-photo               "캡쳐"
   :image-source-gallery                  "사진첩에서 선택"

   ;;sharing
   :sharing-copy-to-clipboard             "클립보드에 복사"
   :sharing-share                         "공유..."
   :sharing-cancel                        "취소"

   :browsing-title                        "둘러보기"
   :browsing-browse                       "@둘러보기"
   :browsing-open-in-web-browser          "웹브라우저에서 열기"
   :browsing-cancel                       "취소"

   ;;sign-up
   :contacts-syncronized                  "당신의 연락처가 동기화 되었습니다"
   :confirmation-code                     (str "감사합니다.당신의 확인코드가 송되었습니다."
                                               "코드.당신의 휴대폰 번호를 확인하기 위해 코드를 입력하세요.")
   :incorrect-code                        (str "죄송합니다.코드가 맞지 않습니다.다시 한번 입력해 주세요.")
   :phew-here-is-your-passphrase          "휴, 힘들었지만 당신의 비밀번호가 여기 있습니다. 기입하시고 안전하게 보관하세요.계정을 열기위해 필요하게 될 것입니다."
   :here-is-your-passphrase               "당신의 비밀번호가 여기 있습니다.기입하시고 안전하게 보관하세요.계정을 열기위해 필요하게 될 것 입니다.."
   :here-is-your-signing-phrase           "당신의 사인 암호가 여기있습니다.거래 인증을 위해 필요하게 될 것입니다. 기입하시고 안전하게 보관하세요."
   :phone-number-required                 "휴대폰 번호를 인증받기 위해 이 곳을 선택하세요.제가 당신의 친구를 찾아 드릴게요."
   :shake-your-phone                      "버그를 찾았거나 신고할 무언가가 있다면? 휴대폰을 흔들어 주세요!"
   :intro-status                          "계정을 설정하고 개인 설정을 변경하기 위해 저와 상담하세요."
   :intro-message1                        "환영해요! 암호를 설정하고 시작하기 위해 여기 메세지를 선택하세요."
   :account-generation-message            "잠시만요, 당신의 계정이 생성중입니다."
   :move-to-internal-failure-message      "외부에서 내부 저장공간으로중요한 파일을 옮겨야합니다. 이를 위해 당신의 허가가 필요합니다.새로운 버전에서는 외부 저장공간을 사용하지 않을 것입니다."
   :debug-enabled                         "오류검출 서버가 개시 되었습니다. 같은 통신망의 컴퓨터에서 서버를 찾기위해 지금 *상태스캔* 을 운영할수 있습니다."

   ;;phone types
   :phone-e164                            "국제 1"
   :phone-international                   "국제 2"
   :phone-national                        "국내"
   :phone-significant                     "주요"

   ;;chats
   :chats                                 "채팅"
   :delete-chat                           "채팅 삭제"
   :new-group-chat                        "새로운 그룹 채팅"
   :new-public-group-chat                 "공용 채팅 입장"
   :edit-chats                            "채팅 편집"
   :search-chats                          "채팅 검색"
   :empty-topic                           "주제 삭제"
   :topic-format                          "잘못된 포멧 [a-z0-9\\-]+"
   :public-group-topic                    "주제"

   ;;discover
   :discover                              "발견"
   :none                                  "없음"
   :search-tags                           "여기에 태그를 입력하세요"
   :popular-tags                          "인기 #해시태그"
   :recent                                "최근상태"
   :no-statuses-found                     "검색된 상태 없음"
   :chat                                  "채팅"
   :all                                   "모두"
   :public-chats                          "공용 채팅"
   :soon                                  "곧"
   :public-chat-user-count                "{{몇}} 명"
   :dapps                                 "ÐApps"
   :dapp-profile                          "ÐApp 프로필"
   :no-statuses-discovered                "발견된 상태 없음"
   :no-statuses-discovered-body           "누군가가 상태를 게시하면 여기에서 볼 수 있습니다."
   :no-hashtags-discovered-title          "발견된 #해시태그 없음"
   :no-hashtags-discovered-body           "인기 해시태그를 여기에서 볼 수 있습니다."

   ;;settings
   :settings                              "설정"

   ;;contacts
   :contacts                              "연락처"
   :new-contact                           "새로운 연락처"
   :delete-contact                        "연락처 삭제"
   :delete-contact-confirmation           "이연락처는연락처 목룍에서삭제 됩니다."
   :remove-from-group                     "그룹에서 삭제"
   :edit-contacts                         "연락처 편집"
   :search-contacts                       "연락처 검색"
   :contacts-group-new-chat               "새로운 채팅 시작"
   :choose-from-contacts                  "연락처에서 선택"
   :no-contacts                           "연락처 아직 없음"
   :show-qr                               "QR 코드 보여주기"
   :enter-address                         "주소 입장"
   :more                                  "더 보기"

   ;;group-settings
   :remove                                "삭제"
   :save                                  "저장"
   :delete                                "삭제"
   :clear-history                         "히스토리 삭제"
   :mute-notifications                    "알림 끔"
   :leave-chat                            "채팅 나가기"
   :chat-settings                         "채팅 설정"
   :edit                                  "편집"
   :add-members                           "회원 추가"

   ;;commands
   :chat-send-eth                         "{{양, 수치}} ETH"

   ;;location command
   :your-current-location                 "나의 현재 위치"
   :places-nearby                         "가까운 장소"
   :search-results                        "결과 검색"
   :dropped-pin                           "핀 지정"
   :location                              "위치"
   :open-map                              "지도 열기"
   :sharing-copy-to-clipboard-address     "주소 복사"
   :sharing-copy-to-clipboard-coordinates "좌표 복사"

   ;;new-group
   :new-group                             "새로운 그룹"
   :reorder-groups                        "그룹 재정렬"
   :edit-group                            "그룹 편집"
   :delete-group                          "그룹 삭제"
   :delete-group-confirmation             "이 그룹은 그룹목록에서 삭제 됩니다. 연락처에 영향을 주지 않습니다."
   :delete-group-prompt                   "연라처에 영향을 주지 않습니다."
   :contact-s                             {:하나의   "연락처"
                                           :다른 "연락처"}

   ;;protocol
   :received-invitation                   "채팅 초대 수락"
   :removed-from-chat                     "그룹채팅에서 당신이 삭제됨"
   :left                                  "떠남"
   :invited                               "초대됨"
   :removed                               "삭제됨"
   :You                                   "당신"

   ;;new-contact
   :add-new-contact                       "새로운 연락처 추가"
   :scan-qr                               "QR 코드 스캔"
   :name                                  "이름"
   :address-explication                   "당신의 공용키는 Ethereum에서 주소를 생성하기 위해 사용되며 숫자와 문자의 조합으로 이루어진다.당신의 프로필에서 쉽게 찾아진다."
   :enter-valid-public-key                "유효한 공용키를 입력하거나 QR코드를 스캔해 주세요."
   :contact-already-added                 "이 연락처는 이미 존재합니다."
   :can-not-add-yourself                  "본인 스스로를 추가할 수 없습니다."
   :unknown-address                       "알 수 없는 연락처"

   ;;login
   :connect                               "접속"
   :address                               "주소"
   :password                              "비밀번호"
   :sign-in-to-status                     "상태에 로그인"
   :sign-in                               "로그인"
   :wrong-password                        "잘못된 비밀번호"
   :enter-password                        "비밀번호 입력"

   ;;recover
   :passphrase                            "긴 암호"
   :recover                               "복구"
   :twelve-words-in-correct-order         "1올바른 순서의 12 문자"

   ;;accounts
   :recover-access                        "접근 복구"
   :create-new-account                    "새로운 계정 생성"

   ;;wallet-qr-code
   :done                                  "완료"

   ;;validation
   :invalid-phone                         "유효하지 않은 전화번호"
   :amount                                "양"

   ;;transactions
   :confirm                               "확정"
   :transaction                           "거래"
   :unsigned-transaction-expired          "사인되지 않은 거래가 만료됨"
   :status                                "상태"
   :recipient                             "수령인"
   :to                                    "에게"
   :from                                  "~로 부터"
   :data                                  "날짜"
   :got-it                                "받음"
   :block                                 "차단"
   :hash                                  "해시"
   :gas-limit                             "가스 제한"
   :gas-price                             "가스 가격"
   :gas-used                              "사용된 가스"
   :cost-fee                              "가격"
   :nonce                                 "임시"
   :confirmations                         "확인"
   :confirmations-helper-text             "거래가 안전하게 진행되었는지 확인하기 위해 적어도 12번의 확인을 기다려 주세요."
   :copy-transaction-hash                 "거래 해시 복사"
   :open-on-etherscan                     "Etherscan.io 에서 열기"

   ;;webview
   :web-view-error                        "어머, 오류"

   ;;testfairy warning
   :testfairy-title                       "경고!"
   :testfairy-message                     "당신은 Nightly Build로부터 설치된 어플을 사용하고 있습니다. 이 Build는 테스트를 위해 레코딩 세션을 포함합니다. 와이파이에 연결시 이 어플상에서의 당신의 모든 활동이 비디오와 활동로그로써저장됩니다. 그리고 이 정보는 문제연구를 위해 서비스팀에 의해 사용되어질 수 있습니다. 저장된 비디오와 활동로드는 비밀번호를 포함하지 않습니다. 어플이 Nightly Build 에서 설치되었을 시에만 레코딩이 개시됩니다. 이 어플이 PlayStore이나 TestFlight에서 설치 된 경우 아무것도 레코딩 되지 않습니다."

   ;; wallet
   :wallet                                "지갑"
   :wallets                               "지갑"
   :your-wallets                          "당신의 지갑"
   :main-wallet                           "메인 지갑"
   :wallet-error                          "로딩 데이타 오류"
   :wallet-send                           "전송"
   :wallet-request                        "요청"
   :wallet-exchange                       "교환"
   :wallet-assets                         "자산"
   :wallet-add-asset                      "자산 추가"
   :wallet-total-value                    "토탈 가치"
   :wallet-settings                       "지갑 설정"
   :signing-phrase-description            "비밀번호를 입력하여거래에 사인하세요.당신의 비밀사인문구와 위의문장을 일치시키는걸 잊지마세요."
   :wallet-insufficient-funds             "불충분한 자금"
   :request-transaction                   "거래 요청"
   :send-request                          "요청 전송"
   :share                                 "공유"
   :eth                                   "ETH"
   :currency                              "통화"
   :usd-currency                          "US달러"
   :transactions                          "거래"
   :transaction-details                   "거래 상세정보"
   :transaction-failed                    "거래 실패"
   :transactions-sign                     "사인"
   :transactions-sign-all                 "모두 사인"
   :transactions-sign-transaction         "거래에 사인"
   :transactions-sign-later               "나중에 사인"
   :transactions-delete                   "거래 삭제"
   :transactions-delete-content           "사인되지 않은 목록에서 거래가 삭제됩니다."
   :transactions-history                  "히스토리"
   :transactions-unsigned                 "사인되지 않음"
   :transactions-history-empty            "히스토리에 아직 거래가 없음"
   :transactions-unsigned-empty           "사인되지 않은 거래가 없습니다."
   :transactions-filter-title             "히스토리 필터"
   :transactions-filter-tokens            "토큰"
   :transactions-filter-type              "종류"
   :transactions-filter-select-all        "모두선택"
   :view-transaction-details              "거래 상세정보 보기"
   :transaction-description               "거래가안전하게 진행되었는지 확인하기위해 적어도12번의 확인을기다려 주세요."
   :transaction-sent                      "거래 전송"
   :transaction-moved-text                "이거래는5분간 사인되지않은 목록에남아있게 됩니다."
   :transaction-moved-title               "거래 이동"
   :sign-later-title                      "거래에 나중에 사인하시겠습니까?"
   :sign-later-text                       "이거래에 사인하기 위해 거래 히스토리를 체크하세요."
   :not-applicable                        "사인되지 않은 거래들 해당되지 않음"

   ;; Wallet Send
   :wallet-choose-recipient               "수령자 선택"
   :wallet-choose-from-contacts           "연락처로부터 선택"
   :wallet-address-from-clipboard         "클립보드로 부터의 주소사용"
   :wallet-invalid-address                "유효하지 않은 주소: \n {{데이타}}"
   :wallet-browse-photos                  "사진 찾기"
   :validation-amount-invalid-number      "숫자가 유효하지 않음"
   :validation-amount-is-too-precise      "숫자가 너무 정밀합니다. 보낼수 있는 가작 작은 단위는1 Wei 입니다. (1x10^-18 ETH)"



   ;; network settings
   :new-network                           "새로운 네트워크"
   :add-network                           "네트워크 추가"
   :add-new-network                       "새로운 네트워크 추가"
   :existing-networks                     "존재하는 네트워크"
   :add-json-file                         "AJSON 파일 추가"
   :paste-json-as-text                    "JSON 글로 붙여넣기"
   :paste-json                            "JSON 붙여넣기"
   :specify-rpc-url                       "RPC URL 명시하기"
   :edit-network-config                   "네트워크 구성체계 편집"
   :connected                             "연결됨"
   :process-json                          "JSON 진행"
   :error-processing-json                 "JSON 진행 오류"
   :rpc-url                               "RPC URL"
   :remove-network                        "네트워크 삭제"
   :network-settings                      "네트워크 설정"
   :edit-network-warning                  "조심하세요. 네트워크정보를 수정하는것은이 네트워크를 손상시킬수 있습니다."
   :connecting-requires-login             "다른 네트워크 접속은 로그인을 필요로 합니다."
   :close-app-title                       "경고!"
   :close-app-content                     "이 어플이 닫힙니다. 다시 재가동 할 시 선택된 네트워크가 사용됩니다."
   :close-app-button                      "확인"})
