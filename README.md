### Introduction 
Web-based Property Management Solution to accompany full cycle of rental deal

### Infrastructure
Infrastructure is managed by AWS CDK using the separate [repo](https://github.com/uToolsTechnology/barrio-infra)

### Monitoring
- [Dev](https://grafana.dev.habi.ae/d/cb9cb109-a720-4447-8723-28b03cacabcc/habi-dev?orgId=1)
- [Prod](https://grafana.dev.habi.ae/d/fdnnbawmawwsgc/habi-prod?orgId=1)

### Logs
#### API
- [Dev](https://grafana.dev.habi.ae/explore?schemaVersion=1&panes=%7B%22mol%22:%7B%22datasource%22:%22fdk6nxb7liccge%22,%22queries%22:%5B%7B%22id%22:%22%22,%22region%22:%22default%22,%22logGroups%22:%5B%7B%22arn%22:%22arn:aws:logs:me-central-1:943521904321:log-group:barrio-api-dev:%2A%22,%22name%22:%22barrio-api-dev%22,%22accountId%22:%22943521904321%22%7D%5D,%22queryMode%22:%22Logs%22,%22namespace%22:%22%22,%22metricName%22:%22%22,%22expression%22:%22fields%20@timestamp,%20@message%22,%22dimensions%22:%7B%7D,%22statistic%22:%22Average%22,%22period%22:%22%22,%22metricQueryType%22:0,%22metricEditorMode%22:0,%22sqlExpression%22:%22%22,%22matchExact%22:true,%22refId%22:%22A%22,%22datasource%22:%7B%22type%22:%22cloudwatch%22,%22uid%22:%22fdk6nxb7liccge%22%7D,%22label%22:%22%22,%22statsGroups%22:%5B%5D%7D%5D,%22range%22:%7B%22from%22:%22now-15m%22,%22to%22:%22now%22%7D%7D%7D&orgId=1)
- [Prod](https://grafana.dev.habi.ae/explore?schemaVersion=1&panes=%7B%22pap%22:%7B%22datasource%22:%22fdnnc4zx6mrr4e%22,%22queries%22:%5B%7B%22id%22:%22%22,%22region%22:%22default%22,%22logGroups%22:%5B%7B%22arn%22:%22arn:aws:logs:me-central-1:704908703383:log-group:barrio-api:%2A%22,%22name%22:%22barrio-api%22,%22accountId%22:%22704908703383%22%7D%5D,%22queryMode%22:%22Logs%22,%22namespace%22:%22%22,%22metricName%22:%22%22,%22expression%22:%22fields%20@timestamp,%20@message%20%22,%22dimensions%22:%7B%7D,%22statistic%22:%22Average%22,%22period%22:%22%22,%22metricQueryType%22:0,%22metricEditorMode%22:0,%22sqlExpression%22:%22%22,%22matchExact%22:true,%22refId%22:%22A%22,%22datasource%22:%7B%22type%22:%22cloudwatch%22,%22uid%22:%22fdnnc4zx6mrr4e%22%7D,%22label%22:%22%22,%22statsGroups%22:%5B%5D%7D%5D,%22range%22:%7B%22from%22:%22now-15m%22,%22to%22:%22now%22%7D%7D%7D&orgId=1)
#### Async-Processor
- [Dev](https://grafana.dev.habi.ae/explore?schemaVersion=1&panes=%7B%22mol%22:%7B%22datasource%22:%22fdk6nxb7liccge%22,%22queries%22:%5B%7B%22id%22:%22%22,%22region%22:%22default%22,%22logGroups%22:%5B%7B%22arn%22:%22arn:aws:logs:me-central-1:943521904321:log-group:barrio-async-processor-dev:%2A%22,%22name%22:%22barrio-async-processor-dev%22,%22accountId%22:%22943521904321%22%7D%5D,%22queryMode%22:%22Logs%22,%22namespace%22:%22%22,%22metricName%22:%22%22,%22expression%22:%22fields%20@timestamp,%20@message%22,%22dimensions%22:%7B%7D,%22statistic%22:%22Average%22,%22period%22:%22%22,%22metricQueryType%22:0,%22metricEditorMode%22:0,%22sqlExpression%22:%22%22,%22matchExact%22:true,%22refId%22:%22A%22,%22datasource%22:%7B%22type%22:%22cloudwatch%22,%22uid%22:%22fdk6nxb7liccge%22%7D,%22label%22:%22%22,%22statsGroups%22:%5B%5D%7D%5D,%22range%22:%7B%22from%22:%22now-15m%22,%22to%22:%22now%22%7D%7D%7D&orgId=1)
- [Prod](https://grafana.dev.habi.ae/explore?schemaVersion=1&panes=%7B%22pap%22:%7B%22datasource%22:%22fdnnc4zx6mrr4e%22,%22queries%22:%5B%7B%22id%22:%22%22,%22region%22:%22default%22,%22logGroups%22:%5B%7B%22arn%22:%22arn:aws:logs:me-central-1:704908703383:log-group:barrio-async-processor:%2A%22,%22name%22:%22barrio-async-processor%22,%22accountId%22:%22704908703383%22%7D%5D,%22queryMode%22:%22Logs%22,%22namespace%22:%22%22,%22metricName%22:%22%22,%22expression%22:%22fields%20@timestamp,%20@message%20%22,%22dimensions%22:%7B%7D,%22statistic%22:%22Average%22,%22period%22:%22%22,%22metricQueryType%22:0,%22metricEditorMode%22:0,%22sqlExpression%22:%22%22,%22matchExact%22:true,%22refId%22:%22A%22,%22datasource%22:%7B%22type%22:%22cloudwatch%22,%22uid%22:%22fdnnc4zx6mrr4e%22%7D,%22label%22:%22%22,%22statsGroups%22:%5B%5D%7D%5D,%22range%22:%7B%22from%22:%22now-15m%22,%22to%22:%22now%22%7D%7D%7D&orgId=1)
#### Notification-Processor
- [Dev](https://grafana.dev.habi.ae/explore?schemaVersion=1&panes=%7B%22mol%22:%7B%22datasource%22:%22fdk6nxb7liccge%22,%22queries%22:%5B%7B%22id%22:%22%22,%22region%22:%22default%22,%22logGroups%22:%5B%7B%22arn%22:%22arn:aws:logs:me-central-1:943521904321:log-group:barrio-notification-processor-dev:%2A%22,%22name%22:%22barrio-notification-processor-dev%22,%22accountId%22:%22943521904321%22%7D%5D,%22queryMode%22:%22Logs%22,%22namespace%22:%22%22,%22metricName%22:%22%22,%22expression%22:%22fields%20@timestamp,%20@message%22,%22dimensions%22:%7B%7D,%22statistic%22:%22Average%22,%22period%22:%22%22,%22metricQueryType%22:0,%22metricEditorMode%22:0,%22sqlExpression%22:%22%22,%22matchExact%22:true,%22refId%22:%22A%22,%22datasource%22:%7B%22type%22:%22cloudwatch%22,%22uid%22:%22fdk6nxb7liccge%22%7D,%22label%22:%22%22,%22statsGroups%22:%5B%5D%7D%5D,%22range%22:%7B%22from%22:%22now-15m%22,%22to%22:%22now%22%7D%7D%7D&orgId=1)
- [Prod](https://grafana.dev.habi.ae/explore?schemaVersion=1&panes=%7B%22pap%22:%7B%22datasource%22:%22fdnnc4zx6mrr4e%22,%22queries%22:%5B%7B%22id%22:%22%22,%22region%22:%22default%22,%22logGroups%22:%5B%7B%22arn%22:%22arn:aws:logs:me-central-1:704908703383:log-group:barrio-notification-processor:%2A%22,%22name%22:%22barrio-notification-processor%22,%22accountId%22:%22704908703383%22%7D%5D,%22queryMode%22:%22Logs%22,%22namespace%22:%22%22,%22metricName%22:%22%22,%22expression%22:%22fields%20@timestamp,%20@message%20%22,%22dimensions%22:%7B%7D,%22statistic%22:%22Average%22,%22period%22:%22%22,%22metricQueryType%22:0,%22metricEditorMode%22:0,%22sqlExpression%22:%22%22,%22matchExact%22:true,%22refId%22:%22A%22,%22datasource%22:%7B%22type%22:%22cloudwatch%22,%22uid%22:%22fdnnc4zx6mrr4e%22%7D,%22label%22:%22%22,%22statsGroups%22:%5B%5D%7D%5D,%22range%22:%7B%22from%22:%22now-15m%22,%22to%22:%22now%22%7D%7D%7D&orgId=1)
#### Outbox
- [Dev](https://grafana.dev.habi.ae/explore?schemaVersion=1&panes=%7B%22mol%22:%7B%22datasource%22:%22fdk6nxb7liccge%22,%22queries%22:%5B%7B%22id%22:%22%22,%22region%22:%22default%22,%22logGroups%22:%5B%7B%22arn%22:%22arn:aws:logs:me-central-1:943521904321:log-group:barrio-outbox-dev:%2A%22,%22name%22:%22barrio-outbox-dev%22,%22accountId%22:%22943521904321%22%7D%5D,%22queryMode%22:%22Logs%22,%22namespace%22:%22%22,%22metricName%22:%22%22,%22expression%22:%22fields%20@timestamp,%20@message%22,%22dimensions%22:%7B%7D,%22statistic%22:%22Average%22,%22period%22:%22%22,%22metricQueryType%22:0,%22metricEditorMode%22:0,%22sqlExpression%22:%22%22,%22matchExact%22:true,%22refId%22:%22A%22,%22datasource%22:%7B%22type%22:%22cloudwatch%22,%22uid%22:%22fdk6nxb7liccge%22%7D,%22label%22:%22%22,%22statsGroups%22:%5B%5D%7D%5D,%22range%22:%7B%22from%22:%22now-15m%22,%22to%22:%22now%22%7D%7D%7D&orgId=1)
- [Prod](https://grafana.dev.habi.ae/explore?schemaVersion=1&panes=%7B%22pap%22:%7B%22datasource%22:%22fdnnc4zx6mrr4e%22,%22queries%22:%5B%7B%22id%22:%22%22,%22region%22:%22default%22,%22logGroups%22:%5B%7B%22arn%22:%22arn:aws:logs:me-central-1:704908703383:log-group:barrio-outbox:%2A%22,%22name%22:%22barrio-outbox%22,%22accountId%22:%22704908703383%22%7D%5D,%22queryMode%22:%22Logs%22,%22namespace%22:%22%22,%22metricName%22:%22%22,%22expression%22:%22fields%20@timestamp,%20@message%20%22,%22dimensions%22:%7B%7D,%22statistic%22:%22Average%22,%22period%22:%22%22,%22metricQueryType%22:0,%22metricEditorMode%22:0,%22sqlExpression%22:%22%22,%22matchExact%22:true,%22refId%22:%22A%22,%22datasource%22:%7B%22type%22:%22cloudwatch%22,%22uid%22:%22fdnnc4zx6mrr4e%22%7D,%22label%22:%22%22,%22statsGroups%22:%5B%5D%7D%5D,%22range%22:%7B%22from%22:%22now-15m%22,%22to%22:%22now%22%7D%7D%7D&orgId=1)

### Backend release flow
- Major version
  1) Once all changes for release are ready on dev branch, create a release branch from dev branch.
  2) Naming rule for release branch is release/1.x+1 where x is the current major version number. For example, if the current release version is 1.15.4, branch name should be release/1.16.
  3) Once release branch is created, push it to the remote repository to initiate the release pipeline - *Build Server Release*.
  4) Once build is finished, the last step is to start *Delpoy server stack (prod)* workflow providing for all tags version from second step (in this case 1.16) and click Run workflow.
  5) Once build is finished, you can check that new version of prod stack is applied, by visiting CloudFormation->Stack->{name of stack}->Parameters and verifying that value for tags updated (1.16 in this case).
- Minor version (generally used for hotfix delivery on production)
  1) Needed change is created on feature branch, based from current major release branch (release/1.x).
  2) Pull request created with target branch as release/1.x. Once approved, pr merged to release/1.x. This merge will force *Build Server Release* workflow.
  3) Build will create new release version tag with patch increment (f.e. if current version is 1.15 -> 1.15.1)
  4) Follow 4 step from Major version flow with but with tag created by previous step
  5) Follow 5 step from Major version flow, to verify that new version is applied.
