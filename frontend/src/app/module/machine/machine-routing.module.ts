import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';
import {MachineListComponent} from './list/list.component';
import {MachineDetailComponent} from './edit/detail.component';
import {GetIdByRoute} from 'spase-ui';
import {MachineService} from './machine.service';

export const spRoutes: any = [
    {
        path: 'machines',
        component: MachineListComponent,
        data: {breadcrumbs: [{value: 'Machine', i18n: 'machine'}]},
    }, {
        path: 'machines/:id',
        component: MachineDetailComponent,
        data: {breadcrumbs: [{value: 'Machine', i18n: 'machine', link: 'machines'}, {path: 'object.name'}]},
        resolve: {id: GetIdByRoute, object: MachineService},
    },
];

@NgModule({
    imports: [
        RouterModule.forChild(spRoutes),
    ],
    exports: [
        RouterModule,
    ],
})
export class MachineRoutingModule {
}
