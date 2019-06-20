import {APP_INITIALIZER, NgModule} from '@angular/core';

import {SpaseModule} from '../../spase.module';

import {MachineI18nService} from './i18n/machine-i18n.service';
import {MachineRoutingModule} from './machine-routing.module';
import {MachineBootService} from './machine-boot.service';
import {MachineService} from './machine.service';
import {MachineListComponent} from './list/list.component';
import {MachineDetailComponent} from './edit/detail.component';

@NgModule({
    imports: [
        ...SpaseModule,

        MachineRoutingModule,
    ],
    declarations: [
        MachineListComponent,
        MachineDetailComponent,
    ],
    providers: [
        MachineI18nService,
        MachineService,
        MachineBootService,
        {
            provide: APP_INITIALIZER,
            useFactory: (service: MachineBootService) => (() => service.init()),
            deps: [MachineBootService],
            multi: true,
        },
    ],
})
export class MachineModule {
}
