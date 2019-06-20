import {APP_INITIALIZER, NgModule} from '@angular/core';

import {SpaseModule} from '../../spase.module';

import {SpI18nService} from './i18n/sp-i18n.service';
import {SpRoutingModule} from './sp-routing.module';
import {SpService} from './sp.service';
import {SpBootService} from './sp-boot.service';
import {SpDetailComponent} from './detail/detail.component';

@NgModule({
    imports: [
        ...SpaseModule,

        SpRoutingModule,
    ],
    declarations: [
        SpDetailComponent,
    ],
    providers: [
        SpI18nService,
        SpService,
        SpBootService,
        {
            provide: APP_INITIALIZER,
            useFactory: (service: SpBootService) => (() => service.init()),
            deps: [SpBootService],
            multi: true,
        },
    ],
})
export class SpModule {
}
