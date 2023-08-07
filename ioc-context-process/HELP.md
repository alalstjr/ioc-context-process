# 진행 과정

## WebClientConfig : Config 설정

인터페이스 WebClientService 를 구현하고 있는 List 목록을 ioc 컨텍스트에서 불러옵니다.
ㄴ 불러오는 이유는 Map 형식으로 된 WebClientServiceFactory 를 구현해서 Bean 으로 등록하기 위해서 입니다.

## webClientServiceFactory

webClientServiceFactory 동작 함으로써 ioc 컨텍스트에 WebClientService 를 담은 Map Bean 이 생성됩니다.
ㄴ 추 후 Key 검색으로 불러와 알맞은 서비스가 동작할 수 있도록 분기처리 해주기 위해서 사용
ㄴ getWebClientService() 함수를 통해서 서비스를 불러옴

## OrderService

OrderService 사용하려는 서비스에서 payLoad 라는 고유 값을 보내서 어떤 서비스인지 판별 후 WebClientService 인터페이스에 구현체를 가져오도록 한다.
WebClientService orderService = webClientServiceFactory.getWebClientService(payLoad);
orderService 값에 분기되어 등록된 클라이언트 서비스가 등록되어 실행된다.

# 구현 순서

1. WebClientConfig
   2. WebClientService
      3. WebClientAService
      3. WebClientBService
      3. WebClientCService
      4. ....
2. WebClientServiceFactory
3. OrderService

# 테스트 하기

URL : http://localhost:8080/api/order
Body : WebClientCService
result : C 업체에게 싱크합니다.

