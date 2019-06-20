import {APP_INITIALIZER, NgModule} from '@angular/core';

import {SpaseModule} from '../../spase.module';

import {CipI18nService} from './i18n/cip-i18n.service';
import {CipRoutingModule} from './cip-routing.module';
import {CipService} from './cip.service';
import {CipBootService} from './cip-boot.service';
import {CipDetailComponent} from './detail/detail.component';

@NgModule({
    imports: [
        ...SpaseModule,

        CipRoutingModule,
    ],
    declarations: [
        CipDetailComponent,
    ],
    providers: [
        CipI18nService,
        CipService,
        CipBootService,
        {
            provide: APP_INITIALIZER,
            useFactory: (service: CipBootService) => (() => service.init()),
            deps: [CipBootService],
            multi: true,
        },
    ],
})
export class CipModule {
}
